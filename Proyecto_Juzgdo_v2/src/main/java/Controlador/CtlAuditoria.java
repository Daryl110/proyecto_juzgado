/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auditoria;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daryl
 */
public class CtlAuditoria {

    private static ArrayList<Auditoria> lstAuditorias = new ArrayList<>();

    public DefaultTableModel listar() {
        lstAuditorias = new ArrayList<>(Main.dao.cargar("Auditoria"));
        String[] lista = {"PERSONA", "ACCIÓN", "ENTIDAD", "FECHA"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        lstAuditorias.forEach((auditoria) -> {
            modelo.addRow(new Object[]{
                auditoria.getPersona(),
                auditoria.getAccion(),
                auditoria.getEntidad(),
                auditoria.getFecha()
            });
        });

        return modelo;
    }

    public DefaultTableModel buscar(Date fecha, String nombreCompleto) {
        ArrayList<Auditoria> lstAuditoriasFiltradas = new ArrayList<>();
        String[] lista = {"PERSONA", "ACCIÓN", "ENTIDAD", "FECHA"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[][]{}, lista);
        if (fecha != null) {
            lstAuditorias.forEach((auditoria) -> {
                if ((new SimpleDateFormat("YYYY-MM-dd").format(fecha)).equals(new SimpleDateFormat("YYYY-MM-dd").format(auditoria.getFecha()))) {
                    lstAuditoriasFiltradas.add(auditoria);
                }
            });
        }
        if (nombreCompleto != null) {
            if (!nombreCompleto.isEmpty()) {
                lstAuditorias.forEach((auditoria) -> {
                    if (auditoria.getPersona().contains(nombreCompleto)) {
                        lstAuditoriasFiltradas.add(auditoria);
                    }
                });
            }
        }
        lstAuditoriasFiltradas.forEach((auditoria) -> {
            modelo.addRow(new Object[]{
                auditoria.getPersona(),
                auditoria.getAccion(),
                auditoria.getEntidad(),
                auditoria.getFecha()
            });
        });

        return modelo;
    }
}
