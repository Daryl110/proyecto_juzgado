package Vista;

import Controlador.Main;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sicg
 */
public class FrmPrincipal extends javax.swing.JFrame {

    FrmReportes pestaña2;
    FrmAvocase pestaña1;
    FrmHerramietas pestaña4;

    public FrmPrincipal() {
        initComponents();
        try {
            setLocationRelativeTo(null);
            this.setExtendedState(this.MAXIMIZED_BOTH);
            pestaña1 = new FrmAvocase();
            pnlInicio.add(pestaña1);
        } catch (Exception e) {
            System.out.println("[Error] : " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        pnlInicio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mi1 = new javax.swing.JMenuItem();
        mi2 = new javax.swing.JMenuItem();
        mi3 = new javax.swing.JMenuItem();
        mi4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlInicio.setPreferredSize(new java.awt.Dimension(1339, 615));

        jMenu3.setText("Procesos");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        mi1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mi1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mi1.setText("Avocase");
        mi1.setToolTipText("Gestión para un nuevo avocase");
        mi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi1ActionPerformed(evt);
            }
        });
        jMenu3.add(mi1);
        mi1.getAccessibleContext().setAccessibleDescription("");

        mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mi2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mi2.setText("Reportes");
        mi2.setToolTipText("Gestión de reportes");
        mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi2ActionPerformed(evt);
            }
        });
        jMenu3.add(mi2);

        mi3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mi3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mi3.setText("Pestaña 3");
        mi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi3ActionPerformed(evt);
            }
        });
        jMenu3.add(mi3);

        mi4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mi4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mi4.setText("Pestaña 4");
        mi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi4ActionPerformed(evt);
            }
        });
        jMenu3.add(mi4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi1ActionPerformed

        if (!pestaña1.isVisible()) {
            if (pestaña1.isClosed()) {
                pnlInicio.remove(pestaña1);
                pnlInicio.add(pestaña1);
            }
            centraVentana(pnlInicio, pestaña1);
            pestaña1.setVisible(true);
        }
    }//GEN-LAST:event_mi1ActionPerformed

    private void mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi2ActionPerformed
        pestaña2 = new FrmReportes();
        pnlInicio.add(pestaña2);
        if (!pestaña2.isVisible()) {
            if (pestaña2.isClosed()) {
                pnlInicio.remove(pestaña2);
                pnlInicio.add(pestaña2);
            }
            centraVentana(pnlInicio, pestaña2);
            pestaña2.setVisible(true);
        }
    }//GEN-LAST:event_mi2ActionPerformed

    private void mi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi3ActionPerformed
        
    }//GEN-LAST:event_mi3ActionPerformed

    private void mi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi4ActionPerformed
        pestaña4 = new FrmHerramietas();
        pnlInicio.add(pestaña4);
        if (!pestaña4.isVisible()) {
            if (pestaña4.isClosed()) {
                pnlInicio.remove(pestaña4);
                pnlInicio.add(pestaña4);
            }
            centraVentana(pnlInicio, pestaña4);
            pestaña4.setVisible(true);
        }
    }//GEN-LAST:event_mi4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mi1;
    private javax.swing.JMenuItem mi2;
    private javax.swing.JMenuItem mi3;
    private javax.swing.JMenuItem mi4;
    private javax.swing.JDesktopPane pnlInicio;
    // End of variables declaration//GEN-END:variables

    private void centraVentana(JDesktopPane i, JInternalFrame p) {
        //El tamaño del panel inicial
        Dimension screenSize = i.getSize();
        //Tamaño del panel interno
        Dimension frameSize = p.getSize();
        //Centrar Ventana
        p.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

    private boolean validar() {
        if (pestaña1.isVisible() || pestaña2.isVisible() || pestaña4.isVisible()) {
            return true;
        }
        return false;
    }

    private void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea salir?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }

}
