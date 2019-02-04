/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Hilos.Cargador;
import Hilos.IniciadorServer;
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
        Cargador cargador = new Cargador(Integer.parseInt(Main.joConfiguracion.get("delayInicio").toString()), false, new FrmLogin(), false, true);
        cargador.start();
        new IniciadorServer(cargador).start();
    }

    public static void cargarConfiguracion() throws FileNotFoundException, IOException, ParseException {
        joConfiguracion = (JSONObject) (new JSONParser().parse(
                new InputStreamReader(
                        new FileInputStream(
                                new File("C:/tmp/conf/conf.json")))));
    }
}
