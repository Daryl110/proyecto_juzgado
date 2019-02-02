/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Delitos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

/**
 *
 * @author Daryl
 */
public class CtlDelito {

    private static ArrayList<Delitos> lstDelitos = new ArrayList<>();

    public DefaultTableModel listar() {
        lstDelitos = new ArrayList<>(Main.dao.cargar("Delitos"));
        String[] lista = {"DESCRIPCIÓN", "D.38B", "D.38G", "LC.64", "DCF"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstDelitos.forEach((delito) -> {
            modelo.addRow(new Object[]{
                delito.getDescripcion(),
                delito.getAtributoUno(),
                delito.getAtributoDos(),
                delito.getAtributoTres(),
                delito.getAtributoCuatro()
            });
        });
        return modelo;
    }

    public boolean registrar(String descricion, String atributo1, String atributo2, String atributo3, String atributo4) {
        Delitos delito = new Delitos(descricion, atributo1, atributo2, atributo3, atributo4);
        JSONObject joRespuesta = Main.dao.guardar(delito);
        System.out.println("[Registrado] : { idOfendido: " + ((JSONObject) joRespuesta.get("Registro")).get("idOfendido") + " }");
        return (Boolean) (joRespuesta).get("Resultado");
    }

    public boolean modificar(String descricion, int row, String atributo1, String atributo2, String atributo3, String atributo4) {
        Delitos delito = new Delitos(lstDelitos.get(row).getIdDelitos(), descricion, atributo1, atributo2, atributo3, atributo4);
        JSONObject joResponse = Main.dao.modificar(delito);
        return (boolean) joResponse.get("Resultado");
    }
}
