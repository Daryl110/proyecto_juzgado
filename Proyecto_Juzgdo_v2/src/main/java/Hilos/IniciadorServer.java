/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import static Controlador.Main.dao;
import DAO.DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Daryl
 */
public class IniciadorServer extends EstructuraHilo{

    private final Cargador cargador;
    
    public IniciadorServer(Cargador cargador){
        this.cargador = cargador;
    }

    @Override
    public synchronized void reanudarHilo(EstructuraHilo hilo) {
        hilo.reanudarHilo(hilo);
    }
    
    @Override
    public void run() {
        try {
            dao = new DAO("ConexionBD");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos\n"
                    + "[" + e + "]\n"
                    + "contacte con el administrador");
            System.exit(0);
        }
        reanudarHilo(this.cargador);
        this.interrupt();
    }
}
