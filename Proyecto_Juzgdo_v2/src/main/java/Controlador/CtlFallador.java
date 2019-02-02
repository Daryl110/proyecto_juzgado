/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Fallador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Daryl
 */
public class CtlFallador {

    private static ArrayList<Fallador> lstFalladores = new ArrayList<>();

    public DefaultTableModel listar() {
        lstFalladores = new ArrayList<>(Main.dao.cargar("Fallador"));
        String[] lista = {"DESCRIPCIÓN"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstFalladores.forEach((fallador) -> {
            modelo.addRow(new Object[]{
                fallador.getDescripcion()
            });
        });
        return modelo;
    }

    public boolean registrar(String descricion) {
        Fallador fallador = new Fallador(descricion);
        JSONObject joRespuesta = Main.dao.guardar(fallador);
        System.out.println("[Registrado] : { idFallador: " + ((JSONObject) joRespuesta.get("Registro")).get("idFallador")+" }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

    public boolean modificar(String descricion, int row) {
        Fallador fallador = new Fallador(lstFalladores.get(row).getIdFallador(), descricion);
        JSONObject joResponse = Main.dao.modificar(fallador);
        return (boolean) joResponse.get("Resultado");
    }
}
