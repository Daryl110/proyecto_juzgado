/*
 *  2018 Daryl Ospina
 */
package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Daryl Ospina
 */
public class Procesos {
    
    public synchronized void iniciarServers() {
        new EjecutadorMySQL().start();
    }

    private boolean ejecutarProceso(String proceso) throws IOException {
        Process process = Runtime.getRuntime().exec(proceso);
        BufferedReader bfrdr = new BufferedReader(new InputStreamReader((InputStream) process.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String strErr;
        if (stdError.ready()) {
            System.err.println("[ERROR] - Errores: ");
            while ((strErr = stdError.readLine()) != null) {
                System.err.println(strErr);
            }
            return false;
        }
        System.err.println("[INFO] - No hay errores: ");
        String strAux = bfrdr.readLine();
        String strSalida = "";
        while (strAux != null) {
            if (strAux.startsWith("[INFO] -")) {
                strAux = bfrdr.readLine();
                continue;
            }
            strSalida += strAux;
            strAux = bfrdr.readLine();
        }
        System.out.println("[INFO] - strSalida: " + strSalida);
        return true;
    }

    private class EjecutadorMySQL extends Thread{

        @Override
        public void run() {
            try {
                if(ejecutarProceso("C:/tmp/mysql/bin/mysqld.exe -u root"))
                    throw new NullPointerException("No se ha podido iniciar mysql");
            } catch (IOException ex) {
                System.out.println("[ERROR] - "+ex);
            }
        }

    }
}
