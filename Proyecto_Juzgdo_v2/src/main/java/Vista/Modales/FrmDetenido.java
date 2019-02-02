package vista.Modales;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nick_
 */
public class FrmDetenido extends javax.swing.JDialog {

    int privacionAño = 0;
    int privacionMes = 0;
    int privacionDia = 0;
    int cumplimientoDia = 0;
    ArrayList<Integer> list;
    DefaultListModel listaRedencion;
    int valor_v;
    int diasTotales;

    public FrmDetenido(java.awt.Frame parent, boolean modal, int valor, int dias, int mes, int ano) {
        super(parent, modal);
        initComponents();
        centraVentana();
        list = new ArrayList<>();
        lblPena.setText("AÑOS: " + ano + " - MESES: " + mes + " - DÍAS: " + dias);
        listaRedencion = new DefaultListModel();
        txtDia.setVisible(false);
        lblDias.setVisible(false);
        txtLugarCarcel.setVisible(false);
        txtObser.setVisible(false);
        lblObservaciones.setVisible(false);
        lstRedencion.setModel(listaRedencion);
        valor_v = valor;
        diasTotales = dias + (mes * 30) + (ano * 365);
        if (valor == 1) {
            pnlSituacionJuridica.setName("DETENIDO EN CARCEL");
            lblLugar.setVisible(false);
            txtObservaciones.setVisible(false);
            btnCaucion.setVisible(false);
            pnl1.setVisible(false);
        }

        pnl1.setName("DETENIDO EN PRISION DOMICILIARIA");
        //setIconImage(new ImageIcon(getClass().getResource("../../juzgado.jpg")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("../../recycle.png"));
        //JLabel fondo = new JLabel();
        //fondo.setIcon(uno);
        //getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        //fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSituacionJuridica = new javax.swing.JPanel();
        cldCaptura = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbCarcel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTiempoP = new javax.swing.JLabel();
        lblTiempoC = new javax.swing.JLabel();
        cldCumplimiento = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        pnl1 = new javax.swing.JPanel();
        lblLugar = new javax.swing.JLabel();
        rdiPermiso = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtFolio = new javax.swing.JTextField();
        btnCaucion = new javax.swing.JButton();
        txtLugar = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblPena = new javax.swing.JLabel();
        txtLugarCarcel = new javax.swing.JTextField();
        rdioDias = new javax.swing.JRadioButton();
        lblDias = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObser = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDiasRedencion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRedencion = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDiasFolio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLugarCarcel1 = new javax.swing.JTextField();
        cldFecha = new com.github.lgooddatepicker.components.DatePicker();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLugarCarcel2 = new javax.swing.JTextField();
        txtLugarCarcel3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detenido");
        setBackground(new java.awt.Color(204, 204, 255));

        pnlSituacionJuridica.setBackground(new java.awt.Color(204, 204, 255));
        pnlSituacionJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Situación Jurídica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        cldCaptura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cldCaptura.setDateFormatString("yyyy-MM-dd");
        cldCaptura.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de captura:");

        cbCarcel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cbCarcel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE LA CARCEL", "EPMSC PEÑAS BLANCAS CALARCA", "EPMSC SAN BERNARDO ARMENIA", "RECLUSIÓN DE MUJERES VILLA CRISTINA ARMENIA", "PERMANENCIA TRANSITORIA" }));
        cbCarcel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbCarcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarcelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("TIEMPO PRIVACION:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("TIENMPO CUMPLIMIENTO:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("FECHA CUMPLIMIENTO:");

        lblTiempoP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTiempoP.setText("AÑOS: 0 - MESES: 0 - DÍAS: 0");

        lblTiempoC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTiempoC.setText("AÑOS: 0 - MESES: 0 - DÍAS: 0");

        cldCumplimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cldCumplimiento.setEnabled(false);
        cldCumplimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("Calcular Fecha");
        jButton4.setToolTipText("Calcula las fechas de la situación juridica, según las fechas ingresadas");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblLugar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLugar.setText("Lugar cumplimiento");

        rdiPermiso.setBackground(new java.awt.Color(255, 255, 255));
        rdiPermiso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdiPermiso.setText("Permiso de trabajo");
        rdiPermiso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdiPermisoStateChanged(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtObservaciones);

        txtFolio.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtFolio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCaucion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCaucion.setText("Caucion");
        btnCaucion.setToolTipText("Añadir caucion a la situación jurídica");
        btnCaucion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCaucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaucionActionPerformed(evt);
            }
        });

        txtLugar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtLugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(rdiPermiso)
                        .addGap(18, 18, 18)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLugar)
                    .addComponent(btnCaucion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdiPermiso)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(txtFolio)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCaucion)
                .addContainerGap())
        );

        btnConfirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setToolTipText("Confirmar la situación juridica del condenado");
        btnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("PENA:");

        lblPena.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPena.setText("AÑOS: 0 - MESES: 0 - DÍAS: 0");

        txtLugarCarcel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtLugarCarcel.setToolTipText("ingrese el lugar exacto");
        txtLugarCarcel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rdioDias.setBackground(new java.awt.Color(204, 204, 255));
        rdioDias.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdioDias.setText("Días Adicionales");
        rdioDias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rdioDias.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdioDiasStateChanged(evt);
            }
        });

        lblDias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDias.setText("DIAS ADICIONALES");

        txtDia.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtDia.setText("0");
        txtDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });

        lblObservaciones.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblObservaciones.setText("OBSERVACIONES:");

        txtObser.setColumns(20);
        txtObser.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtObser.setLineWrap(true);
        txtObser.setRows(5);
        txtObser.setToolTipText("Ingrese las observaciones");
        txtObser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(txtObser);

        javax.swing.GroupLayout pnlSituacionJuridicaLayout = new javax.swing.GroupLayout(pnlSituacionJuridica);
        pnlSituacionJuridica.setLayout(pnlSituacionJuridicaLayout);
        pnlSituacionJuridicaLayout.setHorizontalGroup(
            pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                        .addComponent(cldCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLugarCarcel)
                            .addComponent(cbCarcel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTiempoP, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(lblTiempoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                                        .addComponent(lblDias)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cldCumplimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdioDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSituacionJuridicaLayout.setVerticalGroup(
            pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCarcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cldCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtLugarCarcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSituacionJuridicaLayout.createSequentialGroup()
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblPena))
                        .addGap(20, 20, 20)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTiempoP))
                        .addGap(20, 20, 20)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTiempoC))
                        .addGap(20, 20, 20)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cldCumplimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(pnlSituacionJuridicaLayout.createSequentialGroup()
                                .addComponent(rdioDias)
                                .addGap(18, 18, 18)
                                .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDias)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblObservaciones)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSituacionJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmar)))
                    .addComponent(pnl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        txtLugarCarcel.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Redención Penas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Dias:");

        txtDiasRedencion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtDiasRedencion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDiasRedencion.setVerifyInputWhenFocusTarget(false);
        txtDiasRedencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasRedencionActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Añadir la redención de penas del condenado");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstRedencion);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setToolTipText("Eliminar la redención de penas del condenado");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Folio:");

        txtDiasFolio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtDiasFolio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDiasFolio.setVerifyInputWhenFocusTarget(false);
        txtDiasFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasFolioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Numero:");

        txtNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumero.setVerifyInputWhenFocusTarget(false);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("SANCIONES:");

        txtLugarCarcel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtLugarCarcel1.setToolTipText("ingrese el lugar exacto");
        txtLugarCarcel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLugarCarcel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarCarcel1ActionPerformed(evt);
            }
        });

        cldFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("DIAS SANCION:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("DIAS PENDIENTES:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("DIAS CUMPLIDOS:");

        txtLugarCarcel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtLugarCarcel2.setToolTipText("ingrese el lugar exacto");
        txtLugarCarcel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLugarCarcel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarCarcel2ActionPerformed(evt);
            }
        });

        txtLugarCarcel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtLugarCarcel3.setToolTipText("ingrese el lugar exacto");
        txtLugarCarcel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLugarCarcel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarCarcel3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("FECHA DE EJECUTORIA:");

        datePicker2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDiasRedencion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDiasFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cldFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(datePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLugarCarcel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLugarCarcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLugarCarcel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiasRedencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtDiasFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugarCarcel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtLugarCarcel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLugarCarcel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSituacionJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlSituacionJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiasRedencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasRedencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasRedencionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (cldFecha.getText().isEmpty() || txtDiasRedencion.getText().isEmpty() || txtFolio.getText().isEmpty() || txtNumero.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Por favor, asegurese de que todos los campos han sido correctamente diligenciados.");
        } else {
            int horas = Integer.parseInt(txtDiasRedencion.getText().trim());
            list.add(horas);
            listaRedencion.addElement(cldFecha.getText() + " HORAS: " + horas);
            lstRedencion.setModel(listaRedencion);
            cldFecha.setText("");
            txtDiasRedencion.setText("");
            txtNumero.setText("");
            txtFolio.setText("");

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            calcularTiempoPrivacion();
        } catch (ParseException ex) {
            Logger.getLogger(FrmDetenido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rdioDiasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdioDiasStateChanged
        if (rdioDias.isSelected()) {
            txtDia.setVisible(true);
            lblDias.setVisible(true);
            lblObservaciones.setVisible(true);
            txtObser.setVisible(true);
        } else {
            txtDia.setVisible(false);
            lblDias.setVisible(false);
            lblObservaciones.setVisible(false);
            txtObser.setVisible(false);
        }
    }//GEN-LAST:event_rdioDiasStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int pos = lstRedencion.getSelectedIndex();
            listaRedencion.remove(pos);
            list.remove(pos);
        } catch (Exception e) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Seleccione uno de la lista");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rdiPermisoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdiPermisoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rdiPermisoStateChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (cbCarcel.getSelectedIndex() == 0 || cldCaptura.getDate() == null) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Por favor, asegurese de que todos los campos han sido correctamente diligenciados.");
        } else {
            try {
                if (!calcularTiempoPrivacion()) {
                    if (valor_v == 1) {
                        //Traer el ultimo numero de la tabla o un count mas 1
                        int id = 0 + 1;
                        if (rdioDias.isSelected()) {
                            if (txtDia.getText().isEmpty() || txtObser.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Por favor, asegurese de que todos los campos relacionados \n"
                                        + "a los dias adicionales hayan sido correctamente diligenciados.");
                            } else {
                                //SituacionJuridica detenidoCarcel = new SituacionJuridica(id,cldCaptura.getDate().getTime(),Integer.parseInt(txtDia.getText().trim()),txtObser.getText().trim(),cbCarcel.getSelectedItem()+"", new Date().getTime(), HEIGHT, id)
                            }
                        } else {
                            //SituacionJuridica detenidoCarcel = new SituacionJuridica();
                        }
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(FrmDetenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCaucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaucionActionPerformed
        if (txtLugarCarcel.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Por favor, asegurese de que todos los campos han sido correctamente diligenciados.");
        } else {

        }
    }//GEN-LAST:event_btnCaucionActionPerformed

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtDiaKeyTyped

    private void cbCarcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarcelActionPerformed
        System.out.println(cbCarcel.getSelectedIndex());
        if (cbCarcel.getSelectedIndex() == 3) {
            txtLugarCarcel.setVisible(true);
        } else {
            txtLugarCarcel.setVisible(false);
        }
    }//GEN-LAST:event_cbCarcelActionPerformed

    private void txtDiasFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasFolioActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtLugarCarcel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarCarcel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarCarcel1ActionPerformed

    private void txtLugarCarcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarCarcel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarCarcel2ActionPerformed

    private void txtLugarCarcel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarCarcel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarCarcel3ActionPerformed

    public boolean calcularTiempoPrivacion() throws ParseException {
        if (validarFecha() && verificarFecha()) {
            try {

                Date fechaCaptura = cldCaptura.getDate();
                Calendar calendario = new GregorianCalendar();
                Calendar calendarioActual = Calendar.getInstance();
                calendario.setTime(fechaCaptura);
                for (int i = calendario.get(Calendar.MONTH); i != calendarioActual.get(Calendar.MONTH); i++) {
                    if (i == 13) {
                        i = 1;
                    }
                    privacionMes = +1;
                }

                if (calendarioActual.get(Calendar.DAY_OF_MONTH) < calendario.get(Calendar.DAY_OF_MONTH)) {
                    privacionMes = -1;
                }
                for (int i = calendario.get(Calendar.DAY_OF_MONTH); i == calendarioActual.get(Calendar.DAY_OF_MONTH); i++) {
                    if (i == 31);
                    i = 1;
                    privacionDia++;
                }
                privacionDia += Integer.parseInt(txtDia.getText().trim());
                lblTiempoP.setText("AÑOS: " + privacionAño + " - MESES: " + privacionMes + " - DIAS: " + privacionDia);

                for (int i = 0; i < list.size(); i++) {
                    privacionDia += list.get(i);
                }
                lblTiempoC.setText("AÑOS: " + privacionAño + " - MESES: " + privacionMes + " - DIAS: " + privacionDia);

                Calendar calendarioCumplido = new GregorianCalendar();
                calendarioCumplido.setTime(fechaCaptura);
                diasTotales += privacionDia + (privacionMes * 30) + (privacionAño * 365);
                calendarioCumplido.add(Calendar.DAY_OF_YEAR, diasTotales);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateValue = sdf.format(calendarioActual.getTime());
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                cldCumplimiento.setDate(date);
                return true;
            } catch (NumberFormatException | ParseException ex) {
                JOptionPane.showMessageDialog(null, "[Error] " + ex + " Por favor digite bien las fechas");

            }
        } else {
            return false;
        }
        return false;

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCaucion;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cbCarcel;
    private com.toedter.calendar.JDateChooser cldCaptura;
    private com.toedter.calendar.JDateChooser cldCumplimiento;
    private com.github.lgooddatepicker.components.DatePicker cldFecha;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPena;
    private javax.swing.JLabel lblTiempoC;
    private javax.swing.JLabel lblTiempoP;
    private javax.swing.JList<String> lstRedencion;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlSituacionJuridica;
    private javax.swing.JRadioButton rdiPermiso;
    private javax.swing.JRadioButton rdioDias;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDiasFolio;
    private javax.swing.JTextField txtDiasRedencion;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtLugarCarcel;
    private javax.swing.JTextField txtLugarCarcel1;
    private javax.swing.JTextField txtLugarCarcel2;
    private javax.swing.JTextField txtLugarCarcel3;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObser;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables

    public boolean validarFecha() {
        if (cldCaptura.getDate() == null) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Ingrese los campos importantes");
            return false;
        }
        return true;
    }

    public boolean verificarFecha() {
        Date dat = new Date();//Instancia la fecha del sistema
        if (cldCaptura.getDate().getTime() <= dat.getTime()) {//Compara si la fecha seleccionada es mayor o igual a la fecha actual
            return true;
        }
        JOptionPane.showMessageDialog(this, "La fecha debe ser menor a la fecha actual");
        return false;
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
