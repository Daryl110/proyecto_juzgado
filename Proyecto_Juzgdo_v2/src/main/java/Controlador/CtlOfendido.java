/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ofendidos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Daryl
 */
public class CtlOfendido {
    
    private static ArrayList<Ofendidos> lstOfendido = new ArrayList<>();

    public DefaultTableModel listar() {
        lstOfendido = new ArrayList<>(Main.dao.cargar("Ofendidos"));
        String[] lista = {"DESCRIPCIÓN"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstOfendido.forEach((ofendido) -> {
            modelo.addRow(new Object[]{
                ofendido.getDescripcion()
            });
        });
        return modelo;
    }

    public boolean registrar(String descricion) {
        Ofendidos ofendido = new Ofendidos(descricion);
        JSONObject joRespuesta = Main.dao.guardar(ofendido);
        System.out.println("[Registrado] : { idOfendido: " + ((JSONObject) joRespuesta.get("Registro")).get("idOfendido")+" }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

    public boolean modificar(String descricion, int row) {
        Ofendidos ofendido = new Ofendidos(lstOfendido.get(row).getIdOfendidos(), descricion);
        JSONObject joResponse = Main.dao.modificar(ofendido);
        return (boolean) joResponse.get("Resultado");
    }
}
