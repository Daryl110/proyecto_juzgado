/*
 *  2018 Daryl Ospina
 */
package Hilos;

import Vista.FrmCarga;
import javax.swing.JFrame;

/**
 *
 * @author Daryl Ospina
 */
public class Cargador extends EstructuraHilo {

    private final int segundos;
    private final boolean isCerrar;
    private final JFrame ventanaAbrir;
    private final boolean maximizarVentana;
    private FrmCarga ventanaCarga;
    private boolean suspender;

    public Cargador(int segundos, boolean isCerrar, JFrame ventanaAbrir, boolean maximizarVentana, boolean suspender) {
        this.segundos = segundos;
        this.isCerrar = isCerrar;
        this.ventanaAbrir = ventanaAbrir;
        this.maximizarVentana = maximizarVentana;
        this.suspender = suspender;
    }

    public FrmCarga getVentanaCarga() {
        return this.ventanaCarga;
    }

    @Override
    public void run() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        this.ventanaCarga = new FrmCarga();
        this.ventanaCarga.setLocationRelativeTo(null);
        this.ventanaCarga.setVisible(true);

        this.ventanaCarga.getBarCarga().setMaximum(segundos * 1000);//Convercion a milis
        this.ventanaCarga.getBarCarga().setMinimum(0);
        try {
            for (int i = 0; i <= this.segundos; i++) {
                Cargador.sleep(i * 1000);//Delay en el tiempo de ejecucion del hilo
                this.ventanaCarga.getBarCarga().setValue(i * 1000);//Barra de carga
            }
            
            synchronized (this) {
                while (suspender) {
                    wait();
                }
            }

            if (this.isCerrar) {
                Runtime.getRuntime().freeMemory();
                System.exit(0);
            } else {
                //Validar usuario no solo usuario y contraseña si no tambien la direccion mac permitida
                //Teniendo en cuenta que los servers deben estar encendidos.
                /* Create and display the form */
                if (this.ventanaAbrir != null) {
                    java.awt.EventQueue.invokeLater(() -> {
                        this.ventanaAbrir.setLocationRelativeTo(null);
                        this.ventanaAbrir.setVisible(true);
                        if (this.maximizarVentana) {
                            this.ventanaAbrir.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        }
                    });
                }
            }

            this.ventanaCarga.dispose();
            this.ventanaCarga.setVisible(false);
        } catch (InterruptedException ex) {
            System.out.println("[Error] : " + ex);
        } finally {
            this.interrupt();
        }
    }

    @Override
    public synchronized void reanudarHilo(EstructuraHilo hilo) {
        suspender = false;
        notify();
    }
}
