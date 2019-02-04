/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Vista.FrmLogin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Daryl
 */
public class Main {

    public static JSONObject joConfiguracion;
    public static DAO dao;

    public static void main(String[] args) {
        try {
            Main.cargarConfiguracion();
        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Error a intentar obtener la configuración del archivo de configuración\n"
                    + "C:/tmp/conf/conf.json\n"
                    + "[" + e + "]\n"
                    + "contacte con el administrador");
            System.exit(0);
        }
        try {
            dao = new DAO("ConexionBD");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos\n"
                    + "[" + e + "]\n"
                    + "contacte con el administrador");
            System.exit(0);
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            FrmLogin ventanLogin = new FrmLogin();
            ventanLogin.setLocationRelativeTo(null);
            ventanLogin.setVisible(true);
        });
    }

    public static void cargarConfiguracion() throws FileNotFoundException, IOException, ParseException {
        joConfiguracion = (JSONObject) (new JSONParser().parse(
                new InputStreamReader(
                        new FileInputStream(
                                new File("C:/tmp/conf/conf.json")))));
    }
}
