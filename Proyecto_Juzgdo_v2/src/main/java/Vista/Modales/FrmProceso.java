/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Modales;

import java.awt.Dimension;
import java.awt.Toolkit;
import Vista.FrmPrincipal;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author nick_
 */
public class FrmProceso extends javax.swing.JDialog {

    public FrmProceso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            solicitarDelitos();
            solicitarFallador();
            centraVentana();
            //setIconImage(new ImageIcon(getClass().getResource("../../juzgado.jpg")).getImage());
        } catch (Exception e) {
            System.out.println("[Error] : " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        Fallador = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        txtNI = new javax.swing.JTextField();
        jcalFechaReparto = new com.toedter.calendar.JDateChooser();
        jcalFechaIngreso = new com.toedter.calendar.JDateChooser();
        jcalFechaSentencia = new com.toedter.calendar.JDateChooser();
        Fallador1 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        jcalFechaSentenciaSegunda = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtNumeroCuadernos = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        cbOfendido = new javax.swing.JComboBox<>();
        cbfallador = new javax.swing.JComboBox<>();
        cbfallador2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROCESO");
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informacion Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        lbl8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl8.setText("Fecha Sentencia: (*)");

        Fallador.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Fallador.setText("Fallador: (*)");

        lbl6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl6.setText("Ofendido: (*)");

        lbl5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl5.setText("NI: (*)");

        lbl3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl3.setText("Numero: (*)");

        txtNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 102, 102));
        txtNumero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumero.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl2.setText("Fecha Ingreso: (*)     ");

        lbl1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl1.setText("Fecha de reparto:  (*)");

        txtNI.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNI.setForeground(new java.awt.Color(0, 102, 102));
        txtNI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNIKeyTyped(evt);
            }
        });

        jcalFechaReparto.setBackground(new java.awt.Color(204, 204, 204));
        jcalFechaReparto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcalFechaReparto.setForeground(new java.awt.Color(0, 102, 102));
        jcalFechaReparto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jcalFechaIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jcalFechaIngreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcalFechaIngreso.setForeground(new java.awt.Color(0, 102, 102));
        jcalFechaIngreso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jcalFechaSentencia.setBackground(new java.awt.Color(204, 204, 204));
        jcalFechaSentencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcalFechaSentencia.setForeground(new java.awt.Color(0, 102, 102));
        jcalFechaSentencia.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        Fallador1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Fallador1.setText("Fallador 2°:");

        lbl11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl11.setText("Fecha 2° Sentencia:");

        jcalFechaSentenciaSegunda.setBackground(new java.awt.Color(204, 204, 204));
        jcalFechaSentenciaSegunda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcalFechaSentenciaSegunda.setForeground(new java.awt.Color(0, 102, 102));
        jcalFechaSentenciaSegunda.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Numero Cuadernos: (*)");

        btnAceptar.setBackground(new java.awt.Color(0, 102, 102));
        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\001-accept.png")); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Aceptar la confirmación del proceso");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtNumeroCuadernos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNumeroCuadernos.setForeground(new java.awt.Color(0, 102, 102));
        txtNumeroCuadernos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumeroCuadernos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuadernosActionPerformed(evt);
            }
        });
        txtNumeroCuadernos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuadernosKeyTyped(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\002-rubber.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar el registro del proceso");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbOfendido.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbOfendido.setForeground(new java.awt.Color(0, 102, 102));
        cbOfendido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbfallador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbfallador.setForeground(new java.awt.Color(0, 102, 102));
        cbfallador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbfallador2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbfallador2.setForeground(new java.awt.Color(0, 102, 102));
        cbfallador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl5)
                    .addComponent(lbl6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNI)
                    .addComponent(jcalFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(txtNumero)
                    .addComponent(jcalFechaReparto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOfendido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Fallador)
                                .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcalFechaSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(cbfallador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Fallador1)
                                .addComponent(lbl11)
                                .addComponent(jLabel1))
                            .addGap(18, 35, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumeroCuadernos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcalFechaSentenciaSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbfallador2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fallador)
                                    .addComponent(cbfallador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jcalFechaSentencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Fallador1)
                                    .addComponent(cbfallador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jcalFechaSentenciaSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl11, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcalFechaReparto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2)
                            .addComponent(jcalFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroCuadernos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
//        if (txtNI.getText().isEmpty() || cbfallador.getSelectedIndex() == -1 || txtNumero.getText().isEmpty()
//                || cbOfendido.getSelectedIndex() == -1 || jcalFechaReparto.getDate() == null || jcalFechaIngreso.getDate() == null
//                || txtNumeroCuadernos.getText().isEmpty() || jcalFechaSentencia.getDate() == null) {
//            JOptionPane.showMessageDialog(this, "Por favor llene los campos obligatorios (*)");
//        } else {
//            long fechaIngreso = jcalFechaIngreso.getDate().getTime();
//            JFrmInicio.proceso.setFechaIngreso(fechaIngreso);
//
//            long fechaReparto = jcalFechaReparto.getDate().getTime();
//            JFrmInicio.proceso.setFechaReparto(fechaReparto);
//
//            JFrmInicio.proceso.setNumero(txtNumero.getText().trim());
//            JFrmInicio.proceso.setNi(Integer.parseInt(txtNI.getText().trim()));
//
//            JFrmInicio.proceso.setFallador1(Integer.parseInt(cbfallador.getSelectedIndex() + "".split(" - ")[0]));
//            JFrmInicio.proceso.setofendidosidOfendidos(Integer.parseInt(cbOfendido.getSelectedIndex() + "".split(" - ")[0]));
//
//            long fechaSentencia = jcalFechaSentencia.getDate().getTime();
//            JFrmInicio.proceso.setFechaSentencia(fechaSentencia);
//
//            JFrmInicio.proceso.setNumeroCuadernos(Integer.parseInt(txtNumeroCuadernos.getText().trim()));
//
//            if (jcalFechaSentenciaSegunda.getDate() == null && cbfallador2.getSelectedIndex() == -1) {
//                System.out.println(JFrmInicio.proceso.toString());
//                FrmAvocado.lblNI.setText(JFrmInicio.proceso.getNi() + "");
//                this.setVisible(false);
//                return;
//
//            }
//            if (jcalFechaSentenciaSegunda.getDate() != null && cbfallador2.getSelectedIndex() != -1) {
//
//                long fechaSentencia2 = jcalFechaSentenciaSegunda.getDate().getTime();
//                JFrmInicio.proceso.setFechaSentenci2(fechaSentencia2);
//                JFrmInicio.proceso.setfalladoridFallador1(Integer.parseInt((cbfallador2.getSelectedIndex() + "").split(" - ")[0]));
//                System.out.println(JFrmInicio.proceso.toString());
//                FrmAvocado.lblNI.setText(JFrmInicio.proceso.getNi() + "");
//
//                this.setVisible(false);
//                return;
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Por favor diligencie bien fallador segunda estancia"
//                        + " y/o  fecha segunda estancia");
//            }
//
//        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNumeroCuadernosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuadernosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuadernosActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNIKeyTyped

    private void txtNumeroCuadernosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuadernosKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumeroCuadernosKeyTyped

    private void solicitarDelitos() {
//        JSONArray array = JFrmInicio.cliente.get("ofendido");
//        cbOfendido.addItem("Seleccione un item");
//        for (Object delito : array) {
//            JSONObject joDelito = (JSONObject) delito;
//            cbOfendido.addItem(joDelito.get("idOfendidos") + " - " + joDelito.get("descripcion"));
//        }
    }

    private void solicitarFallador() {
//        JSONArray array = JFrmInicio.cliente.get("fallador");
//        cbfallador.addItem("Seleccione un item");
//        cbfallador2.addItem("Seleccione un item");
//        for (Object delito : array) {
//            JSONObject joDelito = (JSONObject) delito;
//            cbfallador.addItem(joDelito.get("idFallador") + " - " + joDelito.get("descripcion"));
//            cbfallador2.addItem(joDelito.get("idFallador") + " - " + joDelito.get("descripcion"));
//        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fallador;
    private javax.swing.JLabel Fallador1;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbOfendido;
    private javax.swing.JComboBox<String> cbfallador;
    private javax.swing.JComboBox<String> cbfallador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jcalFechaIngreso;
    private com.toedter.calendar.JDateChooser jcalFechaReparto;
    private com.toedter.calendar.JDateChooser jcalFechaSentencia;
    private com.toedter.calendar.JDateChooser jcalFechaSentenciaSegunda;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl8;
    private javax.swing.JTextField txtNI;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroCuadernos;
    // End of variables declaration//GEN-END:variables

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