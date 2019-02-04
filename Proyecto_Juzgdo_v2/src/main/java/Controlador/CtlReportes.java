/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daryl
 */
public class CtlReportes {

    public static ArrayList<Integer> idSituacionesJ = new ArrayList<>();
    public static boolean cargar = true;

    public DefaultTableModel buscar(int opcion, String valor) {

        idSituacionesJ = new ArrayList<>();

        String[] columnas = {"Nombre Condenado", "Identificación", "NI", "Numero", "Situacion Juridica"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, columnas);
        String consulta = "SELECT p.nombreCondenado NOMBRE,p.identificacionCondenado IDENTIFICACION, p.Procesos_NI NI, pr.Numero NUMERO, "
                + "sj.id SITUACION, sj.tipo TIPO_S FROM pena p\n"
                + "JOIN procesos pr ON p.Procesos_NI=pr.NI JOIN situacionjuridica sj ON sj.pena_id=p.id WHERE ";

        switch (opcion) {
            case 1:
                consulta += "pr.Numero = '" + valor + "';";
                break;
            case 2:
                consulta += "p.Procesos_NI = '" + valor + "';";
                break;
            case 3:
                consulta += "p.nombreCondenado REGEXP '" + valor + "';";
                break;
            case 4:
                consulta += "p.identificacionCondenado = '" + valor + "';";
                break;
        }

        ArrayList<Object[]> lstObjetos = new ArrayList<>(Main.dao.cargarConsulta(consulta, null));

        lstObjetos.stream().map((objeto) -> {
            modelo.addRow(new Object[]{
                objeto[0],
                objeto[1],
                objeto[2],
                objeto[3],
                objeto[5]
            });
            return objeto;
        }).forEachOrdered((objeto) -> {
            idSituacionesJ.add(Integer.parseInt(objeto[4] + ""));
        });

        return modelo;
    }

    public void generarFichaTecnica(String identificacion, String ni, int row) {
        
    }

}
