/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Derechos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Daryl
 */
public class CtlDerechos {
    
    private static ArrayList<Derechos> lstDerechos = new ArrayList<>();

    public DefaultTableModel listar() {
        lstDerechos = new ArrayList<>(Main.dao.cargar("Derechos"));
        String[] lista = {"DESCRIPCIÓN"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstDerechos.forEach((derecho) -> {
            modelo.addRow(new Object[]{
                derecho.getDescripcion()
            });
        });
        return modelo;
    }

    public boolean registrar(String descricion) {
        Derechos derecho = new Derechos(descricion);
        JSONObject joRespuesta = Main.dao.guardar(derecho);
        System.out.println("[Registrado] : { idOfendido: " + ((JSONObject) joRespuesta.get("Registro")).get("idOfendido")+" }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

    public boolean modificar(String descricion, int row) {
        Derechos derecho = new Derechos(lstDerechos.get(row).getIdDerechos(), descricion);
        JSONObject joResponse = Main.dao.modificar(derecho);
        return (boolean) joResponse.get("Resultado");
    }
}
