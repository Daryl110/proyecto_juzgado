package vista.Modales;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author nick_
 */
public class FrmOrden extends javax.swing.JDialog {

    String pena1 = "";

    public FrmOrden(java.awt.Frame parent, boolean modal, String pena, int valor) {
        super(parent, modal);
        initComponents();
        centraVentana();
        pena1 = pena;
        if (valor == 1) {
            txtDespacho.setVisible(false);
            lblDes.setVisible(false);
        } else if (valor == 2 && valor == 3) {
            txtDespacho.setVisible(false);
            lblDes.setVisible(false);
            lblNumero.setVisible(false);
            txtNumeroOrden.setVisible(false);
        } else if (valor == 4) {
            lblNumero.setText("Numero proceso");
        }
        //setIconImage(new ImageIcon(getClass().getResource("../../juzgado.jpg")).getImage());
        //((JPanel) getContentPane()).setOpaque(false);
//        ImageIcon uno = new ImageIcon(this.getClass().getResource("C:\\tmp\\img\\003-add.png"));
//        JLabel fondo = new JLabel();
//        fondo.setIcon(uno);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cldEjecutoria = new com.toedter.calendar.JDateChooser();
        txtNumeroOrden = new javax.swing.JTextField();
        cldFechaP = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblDes = new javax.swing.JLabel();
        txtDespacho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Situacion Juridica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);

        lblNumero.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblNumero.setText("Número orden captura");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Fecha ejecutoria:");

        cldEjecutoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cldEjecutoria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txtNumeroOrden.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNumeroOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroOrdenKeyTyped(evt);
            }
        });

        cldFechaP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cldFechaP.setEnabled(false);
        cldFechaP.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Fecha preescripcion fecha :");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\002-calculator.png")); // NOI18N
        jButton1.setText("Calcular fechas");
        jButton1.setToolTipText("Calcula las fechas de la situación juridica, según las fechas ingresadas");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\003-add.png")); // NOI18N
        jButton2.setText("Añadir");
        jButton2.setToolTipText("Confirmar la situación juridica del condenado");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDes.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblDes.setText("Despacho:");

        txtDespacho.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtDespacho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cldEjecutoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroOrden)
                    .addComponent(lblNumero)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cldFechaP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblDes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDespacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cldEjecutoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cldFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cldEjecutoria.getDate() != null) {
            try {
                calcularTiempoPrivacion();
            } catch (ParseException ex) {
                Logger.getLogger(FrmOrden.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Por favor agregue la fecha y los dias o meses de periodo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumeroOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroOrdenKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumeroOrdenKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser cldEjecutoria;
    private com.toedter.calendar.JDateChooser cldFechaP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTextField txtDespacho;
    private javax.swing.JTextField txtNumeroOrden;
    // End of variables declaration//GEN-END:variables

    public void calcularTiempoPrivacion() throws ParseException {
        Date fechaPeriodo = cldEjecutoria.getDate();
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fechaPeriodo);
        int mes = Integer.parseInt(pena1.split(" - ")[0]);
        int dia = Integer.parseInt(pena1.split(" - ")[1]);

        if (mes < 60) {
            calendario.add(Calendar.MONTH, 60);
        } else {
            calendario.add(Calendar.MONTH, mes);
        }

        calendario.add(Calendar.DAY_OF_YEAR, dia);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateValue = sdf.format(calendario.getTime());
        System.out.println(dateValue);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
        cldFechaP.setDate(date);

    }
    
        public boolean validarNumeros(java.awt.event.KeyEvent evt) {
        Character s1 = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && s1 != evt.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo ingrese caracteres númericos");
            return false;
        }
        return true;
    }

    public void centraVentana() {

        //El tamaño de pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //Tamaño Aplicación
        Dimension frameSize = getSize();

        // No exceder la pantalla
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }

        //Centrar Ventana
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

}
