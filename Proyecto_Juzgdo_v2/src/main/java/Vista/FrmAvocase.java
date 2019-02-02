package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import vista.Modales.FrmCondi;
import vista.Modales.FrmDetenido;
import vista.Modales.FrmOrden;

/**
 *
 * @author sicg
 */
public class FrmAvocase extends javax.swing.JInternalFrame {

    DefaultListModel listaDelitos;
    DefaultListModel listaAcumulados;
    DefaultListModel listaRequeridos;
    //ArrayList<JSONObject> listaJsonDelitos;
    //ArrayList<JSONObject> listaJsonAcumulados;
    //ArrayList<JSONObject> listaJsonRequeridos;

    public FrmAvocase() {
        initComponents();
        listaDelitos = new DefaultListModel();
        listaAcumulados = new DefaultListModel();
        listaRequeridos = new DefaultListModel();
        jListDelitos2.setModel(listaDelitos);
        lstAcumulados.setModel(listaAcumulados);
        lstRequerido.setModel(listaRequeridos);
        solicitarDelitos();
        solicitarFallador();
        solicitarOfendidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblCondenados = new javax.swing.JTable();
        lbl9 = new javax.swing.JLabel();
        cbDelito2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDelitos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDelitos1 = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAvocase = new javax.swing.JPanel();
        Fallador = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        Fallador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroCuadernos = new javax.swing.JTextField();
        cbOfendido = new javax.swing.JComboBox<>();
        cbfallador2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        txtNumero3 = new javax.swing.JTextField();
        txtNumero4 = new javax.swing.JTextField();
        txtNumero5 = new javax.swing.JTextField();
        txtNumero6 = new javax.swing.JTextField();
        lblNI = new javax.swing.JLabel();
        txtNI = new javax.swing.JTextField();
        cldFechaSentencia = new com.github.lgooddatepicker.components.DatePicker();
        cldFechaSentencia2 = new com.github.lgooddatepicker.components.DatePicker();
        lbl12 = new javax.swing.JLabel();
        cldReparto = new com.github.lgooddatepicker.components.DatePicker();
        cldingreso = new com.github.lgooddatepicker.components.DatePicker();
        lbl13 = new javax.swing.JLabel();
        cldHechos = new com.github.lgooddatepicker.components.DatePicker();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        txtJuzgado = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cbfallador = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCondenado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAnoMulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMesesPena = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiasPena = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        cbSituacion = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListDelitos2 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbDelito = new javax.swing.JComboBox<>();
        lbl10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtProcesoRequerido = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstAcumulados = new javax.swing.JList<>();
        btnAgregarProcesoAcumulado = new javax.swing.JButton();
        btnEliminarProcesoAcumulado = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstRequerido = new javax.swing.JList<>();
        txtProcesoReuqrido = new javax.swing.JTextField();
        btnAgregarProcesoAcumulado1 = new javax.swing.JButton();
        btnEliminarProcesoAcumulado1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        tblCondenados.setBackground(new java.awt.Color(153, 153, 255));
        tblCondenados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCondenados.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblCondenados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificacion", "Pena", "Multa", "Situacion Juridica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCondenados.setGridColor(new java.awt.Color(0, 0, 0));
        tblCondenados.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblCondenados);

        lbl9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl9.setText("Delitos:");

        cbDelito2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbDelito2.setToolTipText("Lista de delitos");
        cbDelito2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbDelito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelito2ActionPerformed(evt);
            }
        });

        jListDelitos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jListDelitos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jListDelitos);

        jListDelitos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jListDelitos1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jListDelitos1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("Avocase");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        pnlAvocase.setBackground(new java.awt.Color(255, 255, 255));
        pnlAvocase.setMinimumSize(new java.awt.Dimension(25, 25));

        Fallador.setText("Fallador:");
        Fallador.setBackground(new java.awt.Color(0, 0, 0));
        Fallador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbl6.setText("Ofendido:");
        lbl6.setBackground(new java.awt.Color(0, 0, 0));
        lbl6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbl3.setText("Numero:");
        lbl3.setBackground(new java.awt.Color(0, 0, 0));
        lbl3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        Fallador1.setText("Fallador 2°:");
        Fallador1.setBackground(new java.awt.Color(0, 0, 0));
        Fallador1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setText("N° Cuadernos:");
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumeroCuadernos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroCuadernos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumeroCuadernos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumeroCuadernos.setMinimumSize(new java.awt.Dimension(25, 25));
        txtNumeroCuadernos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuadernosKeyTyped(evt);
            }
        });

        cbOfendido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbOfendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbfallador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbfallador2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("GESTION AVOCASE");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Judge-icon.png")); // NOI18N
        jButton1.setText("FALLADOR");
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setToolTipText("AGREGAR NUEVO FALLADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Open-Folder-Add-icon.png")); // NOI18N
        jButton2.setText("OFENDIDO");
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setToolTipText("AGREGAR NUEVO OFENDIDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtNumero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero1.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero1KeyTyped(evt);
            }
        });

        txtNumero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero2.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero2KeyTyped(evt);
            }
        });

        txtNumero3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero3.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero3KeyTyped(evt);
            }
        });

        txtNumero4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero4.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero4KeyTyped(evt);
            }
        });

        txtNumero5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero5.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero5KeyTyped(evt);
            }
        });

        txtNumero6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumero6.setCaretColor(new java.awt.Color(0, 102, 102));
        txtNumero6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumero6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero6KeyTyped(evt);
            }
        });

        lblNI.setText("NI:");
        lblNI.setBackground(new java.awt.Color(0, 0, 0));
        lblNI.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNI.setMinimumSize(new java.awt.Dimension(25, 25));
        txtNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNIKeyTyped(evt);
            }
        });

        cldFechaSentencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cldFechaSentencia.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cldFechaSentencia.setToolTipText("FECHA DE LA PRIMERA SENTENCIA");

        cldFechaSentencia2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cldFechaSentencia2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cldFechaSentencia2.setToolTipText("FECHA DE LA SEGUNDA SENTENCIA");

        lbl12.setText("Fecha Reparto:");
        lbl12.setBackground(new java.awt.Color(0, 0, 0));
        lbl12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        cldReparto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cldReparto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        cldingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cldingreso.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        lbl13.setText("Fecha Ingreso:");
        lbl13.setBackground(new java.awt.Color(0, 0, 0));
        lbl13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        cldHechos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cldHechos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        lbl14.setText("Fecha Hechos:");
        lbl14.setBackground(new java.awt.Color(0, 0, 0));
        lbl14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbl15.setText("Juzgado:");
        lbl15.setBackground(new java.awt.Color(0, 0, 0));
        lbl15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtJuzgado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJuzgado.setText("PRIMERO DE EJECUCION DE PENAS Y MEDIDAS DE SEGURIDAD");
        txtJuzgado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtJuzgado.setCaretColor(new java.awt.Color(0, 102, 102));
        txtJuzgado.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtJuzgado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJuzgadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJuzgadoKeyTyped(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbfallador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbfallador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnlAvocaseLayout = new javax.swing.GroupLayout(pnlAvocase);
        pnlAvocase.setLayout(pnlAvocaseLayout);
        pnlAvocaseLayout.setHorizontalGroup(
            pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvocaseLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAvocaseLayout.createSequentialGroup()
                        .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAvocaseLayout.createSequentialGroup()
                                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Fallador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fallador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlAvocaseLayout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNI)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbfallador2, javax.swing.GroupLayout.Alignment.LEADING, 0, 757, Short.MAX_VALUE)
                                    .addComponent(cbOfendido, javax.swing.GroupLayout.Alignment.LEADING, 0, 757, Short.MAX_VALUE)
                                    .addComponent(cbfallador, javax.swing.GroupLayout.Alignment.LEADING, 0, 757, Short.MAX_VALUE)))
                            .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtJuzgado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAvocaseLayout.createSequentialGroup()
                                    .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cldReparto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                    .addGap(50, 50, 50)
                                    .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cldingreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cldHechos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cldFechaSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cldFechaSentencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlAvocaseLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNumeroCuadernos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAvocaseLayout.setVerticalGroup(
            pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvocaseLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNI)
                    .addComponent(txtNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuadernos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAvocaseLayout.createSequentialGroup()
                        .addComponent(Fallador)
                        .addGap(53, 53, 53)
                        .addComponent(Fallador1)
                        .addGap(52, 52, 52)
                        .addComponent(lbl6))
                    .addGroup(pnlAvocaseLayout.createSequentialGroup()
                        .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cldFechaSentencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbfallador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbfallador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cldFechaSentencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(cbOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlAvocaseLayout.createSequentialGroup()
                            .addComponent(lbl12)
                            .addGap(18, 18, 18)
                            .addComponent(cldReparto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAvocaseLayout.createSequentialGroup()
                            .addComponent(lbl13)
                            .addGap(18, 18, 18)
                            .addComponent(cldingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvocaseLayout.createSequentialGroup()
                        .addComponent(lbl14)
                        .addGap(18, 18, 18)
                        .addGroup(pnlAvocaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cldHechos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(lbl15)
                .addGap(18, 18, 18)
                .addComponent(txtJuzgado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AVOCASE", pnlAvocase);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIdentificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });

        jLabel7.setText("Identificacion Condenado:");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setText("Nombre Condenado:");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNombreCondenado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreCondenado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setText("Pena:");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setText("Año:");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtAnoMulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAnoMulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAnoMulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoMultaKeyTyped(evt);
            }
        });

        jLabel4.setText("Meses:");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtMesesPena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMesesPena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMesesPena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesesPenaKeyTyped(evt);
            }
        });

        jLabel5.setText("Dias:");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDiasPena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiasPena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setText("Multa:");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtMulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMultaKeyTyped(evt);
            }
        });

        cbSituacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una situacion juridica", "Detenido en carcel", "Detenido en prision domiciliaria", "Suspencion condicional", "Libertad condicional", "Orden de captura", "Sin orden de captura", "Bajo medida de seguridad", "Bajo medida de seguridad en libertad vigilada" }));
        cbSituacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbSituacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbSituacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacionActionPerformed(evt);
            }
        });

        jLabel13.setText("Situacion Juridica:");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addGap(117, 117, 117)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbSituacion, 0, 364, Short.MAX_VALUE)
                    .addComponent(txtNombreCondenado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMesesPena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiasPena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMulta, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreCondenado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtAnoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMesesPena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiasPena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20))
        );

        jLabel9.getAccessibleContext().setAccessibleDescription("");

        lbl11.setText("FORMULARIO DEL CONDENADO:");
        lbl11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Button-Add-icon.png")); // NOI18N
        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setToolTipText("Se añade los delitos al condenado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jListDelitos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListDelitos2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(jListDelitos2);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Actions-window-close-icon.png")); // NOI18N
        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setToolTipText("Se elimina el delito seleccionado de la lista");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Aceptar.png")); // NOI18N
        jButton4.setText("AÑADIR NUEVO");
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setToolTipText("Añade un nuevo delito a la lista de delitos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbDelito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbDelito.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbDelito.setToolTipText("Lista de delitos");
        cbDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        lbl10.setText("DELITOS DEL CONDENADO:");
        lbl10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProcesoRequerido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProcesoRequerido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProcesoRequerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcesoRequeridoActionPerformed(evt);
            }
        });
        txtProcesoRequerido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProcesoRequeridoKeyTyped(evt);
            }
        });

        lstAcumulados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane7.setViewportView(lstAcumulados);

        btnAgregarProcesoAcumulado.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Button-Add-icon.png")); // NOI18N
        btnAgregarProcesoAcumulado.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarProcesoAcumulado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarProcesoAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarProcesoAcumulado.setForeground(new java.awt.Color(0, 0, 255));
        btnAgregarProcesoAcumulado.setToolTipText("Se añade el proceso anotado anteriormente");
        btnAgregarProcesoAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoAcumuladoActionPerformed(evt);
            }
        });

        btnEliminarProcesoAcumulado.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Actions-window-close-icon.png")); // NOI18N
        btnEliminarProcesoAcumulado.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarProcesoAcumulado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarProcesoAcumulado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminarProcesoAcumulado.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminarProcesoAcumulado.setToolTipText("Se elimina el proceso seleccionado de la lista");
        btnEliminarProcesoAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProcesoAcumuladoActionPerformed(evt);
            }
        });

        lstRequerido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane8.setViewportView(lstRequerido);

        txtProcesoReuqrido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProcesoReuqrido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProcesoReuqrido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProcesoReuqridoKeyTyped(evt);
            }
        });

        btnAgregarProcesoAcumulado1.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Button-Add-icon.png")); // NOI18N
        btnAgregarProcesoAcumulado1.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarProcesoAcumulado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarProcesoAcumulado1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarProcesoAcumulado1.setForeground(new java.awt.Color(0, 0, 255));
        btnAgregarProcesoAcumulado1.setToolTipText("Se añade el proceso anotado anteriormente");
        btnAgregarProcesoAcumulado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoAcumulado1ActionPerformed(evt);
            }
        });

        btnEliminarProcesoAcumulado1.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\Actions-window-close-icon.png")); // NOI18N
        btnEliminarProcesoAcumulado1.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarProcesoAcumulado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarProcesoAcumulado1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminarProcesoAcumulado1.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminarProcesoAcumulado1.setToolTipText("Se elimina el proceso seleccionado de la lista");
        btnEliminarProcesoAcumulado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProcesoAcumulado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtProcesoRequerido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarProcesoAcumulado)
                    .addComponent(btnEliminarProcesoAcumulado))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarProcesoAcumulado1)
                            .addComponent(btnEliminarProcesoAcumulado1)))
                    .addComponent(txtProcesoReuqrido, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcesoRequerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcesoReuqrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAgregarProcesoAcumulado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarProcesoAcumulado1))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAgregarProcesoAcumulado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarProcesoAcumulado)
                                .addGap(54, 54, 54))))))
        );

        jLabel12.setText("PROCESOS ACUMULADOS:");
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel14.setText("PROCESO REQUERIDO:");
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl11)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addContainerGap(61, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton9)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl11)
                    .addComponent(lbl10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONDENADOS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrar();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        validarNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtMesesPenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesesPenaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtMesesPenaKeyTyped

    private void txtMultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMultaKeyTyped
        validarNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultaKeyTyped

    private void cbSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacionActionPerformed
        if (txtIdentificacion.getText().isEmpty() || txtNombreCondenado.getText().isEmpty()
                || txtMesesPena.getText().isEmpty() || txtDiasPena.getText().isEmpty()
                || txtMulta.getText().isEmpty() || txtAnoMulta.getText().isEmpty()
                || cbSituacion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor llene bien los campos de la seccion pena");
        } else {
            int meses = Integer.parseInt(txtMesesPena.getText().trim());
            int anos = Integer.parseInt(txtAnoMulta.getText().trim());
            int dias = Integer.parseInt(txtDiasPena.getText().trim());

            switch (cbSituacion.getSelectedIndex()) {
                case 1: {
                    FrmDetenido pnD = new FrmDetenido(null, true, 1, dias, meses, anos);
                    pnD.setVisible(true);
                    break;
                }
                case 2: {
                    FrmDetenido pnD = new FrmDetenido(null, true, 0, dias, meses, anos);
                    pnD.setVisible(true);
                    break;
                }
                case 3: {
                    FrmCondi d = new FrmCondi(null, true, 1);
                    d.setVisible(true);
                    break;
                }
                case 4: {
                    FrmCondi d = new FrmCondi(null, true, 0);
                    d.setVisible(true);
                    break;
                }
                case 5: {
                    FrmOrden d = new FrmOrden(null, true, txtMesesPena.getText().trim() + " - " + txtDiasPena.getText().trim(), 1);
                    d.setVisible(true);
                    break;
                }
                case 6: {
                    FrmOrden d = new FrmOrden(null, true, txtMesesPena.getText().trim() + " - " + txtDiasPena.getText().trim(), 2);
                    d.setVisible(true);
                    break;
                }
                case 7: {
                    FrmCondi d = new FrmCondi(null, true, 0);
                    d.setVisible(true);
                    break;
                }
                case 8: {
                    FrmCondi d = new FrmCondi(null, true, 0);
                    d.setVisible(true);
                    break;
                }
                default:
                    break;
            }
        }
    }//GEN-LAST:event_cbSituacionActionPerformed

    private void txtAnoMultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoMultaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtAnoMultaKeyTyped

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void cbDelito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelito2ActionPerformed

    }//GEN-LAST:event_cbDelito2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!(cbDelito.getSelectedIndex() == 0)) {
            listaDelitos.addElement(cbDelito.getSelectedItem() + "");
            cbDelito.removeItemAt(cbDelito.getSelectedIndex());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            int pos = jListDelitos2.getSelectedIndex();
            cbDelito.addItem(jListDelitos2.getSelectedValue());
            listaDelitos.remove(pos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione uno de la lista");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cbDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelitoActionPerformed

    }//GEN-LAST:event_cbDelitoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String delito = JOptionPane.showInputDialog("Ingrese por favor el nuevo delito").toUpperCase();
        JSONObject joDelito = new JSONObject();
        joDelito.put("descripcion", delito);
//        System.out.println(JFrmInicio.cliente.post(joDelito, "Delitos").readEntity(String.class));
        solicitarDelitos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        try {
//            String ofendido = JOptionPane.showInputDialog("Ingrese por favor el nuevo ofendido").toUpperCase();
//            CtlOfendido controladorOfendido = new CtlOfendido();
//            if (controladorOfendido.registrar(ofendido)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el ofendido con exito");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el ofendido");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
//        solicitarOfendidos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String fallador = JOptionPane.showInputDialog("Ingrese por favor el nuevo fallador").toUpperCase();
//        try {
//            CtlFallador controladorFallador = new CtlFallador();
//            if (controladorFallador.registrar(fallador)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el falldor con exito");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el fallador");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
//        solicitarFallador();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumeroCuadernosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuadernosKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumeroCuadernosKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNumero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero1KeyTyped

    private void txtNumero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero2KeyTyped

    private void txtNumero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero3KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero3KeyTyped

    private void txtNumero4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero4KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero4KeyTyped

    private void txtNumero5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero5KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero5KeyTyped

    private void txtNumero6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero6KeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNumero6KeyTyped

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        if (txtNumero.getText().length() == 4) {
            txtNumero1.requestFocus();
        }
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void txtNumero1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyPressed
        if (txtNumero1.getText().length() == 1) {
            txtNumero2.requestFocus();
        }
    }//GEN-LAST:event_txtNumero1KeyPressed

    private void txtNumero2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyPressed
        if (txtNumero2.getText().length() == 1) {
            txtNumero3.requestFocus();
        }
    }//GEN-LAST:event_txtNumero2KeyPressed

    private void txtNumero3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero3KeyPressed
        if (txtNumero3.getText().length() == 2) {
            txtNumero4.requestFocus();
        }
    }//GEN-LAST:event_txtNumero3KeyPressed

    private void txtNumero4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero4KeyPressed
        if (txtNumero4.getText().length() == 3) {
            txtNumero5.requestFocus();
        }
    }//GEN-LAST:event_txtNumero4KeyPressed

    private void txtNumero5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero5KeyPressed
        if (txtNumero5.getText().length() == 4) {
            txtNumero6.requestFocus();
        }
    }//GEN-LAST:event_txtNumero5KeyPressed

    private void txtNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtNIKeyTyped

    private void txtNumero6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero6KeyPressed
        if (txtNumero6.getText().length() == 1) {
            txtNI.requestFocus();
        }
    }//GEN-LAST:event_txtNumero6KeyPressed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtProcesoRequeridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcesoRequeridoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtProcesoRequeridoKeyTyped

    private void btnAgregarProcesoAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoAcumuladoActionPerformed
        if (!(txtProcesoRequerido.getText().isEmpty())) {
            listaAcumulados.addElement(txtProcesoRequerido.getText().trim());
            txtProcesoRequerido.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un NI");
        }
    }//GEN-LAST:event_btnAgregarProcesoAcumuladoActionPerformed

    private void btnEliminarProcesoAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcesoAcumuladoActionPerformed
        try {
            int pos = lstAcumulados.getSelectedIndex();
            listaAcumulados.remove(pos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione uno de la lista");
        }
    }//GEN-LAST:event_btnEliminarProcesoAcumuladoActionPerformed

    private void txtJuzgadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJuzgadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJuzgadoKeyPressed

    private void txtJuzgadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJuzgadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJuzgadoKeyTyped

    private void btnEliminarProcesoAcumulado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcesoAcumulado1ActionPerformed
        try {
            int pos = lstRequerido.getSelectedIndex();
            listaRequeridos.remove(pos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione uno de la lista");
        }
    }//GEN-LAST:event_btnEliminarProcesoAcumulado1ActionPerformed

    private void btnAgregarProcesoAcumulado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoAcumulado1ActionPerformed
        if (!(txtProcesoRequerido.getText().isEmpty())) {
            listaRequeridos.addElement(txtProcesoRequerido.getText().trim());
            txtProcesoRequerido.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un NI");
        }
    }//GEN-LAST:event_btnAgregarProcesoAcumulado1ActionPerformed

    private void txtProcesoReuqridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcesoReuqridoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtProcesoReuqridoKeyTyped

    private void txtProcesoRequeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcesoRequeridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcesoRequeridoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtNI.getText().isEmpty() || cbfallador.getSelectedIndex() == 0 || txtNumero.getText().isEmpty()
                || txtNumero1.getText().isEmpty() || txtNumero2.getText().isEmpty() || txtNumero3.getText().isEmpty()
                || txtNumero4.getText().isEmpty() || txtNumero5.getText().isEmpty() || txtNumero6.getText().isEmpty()
                || cbOfendido.getSelectedIndex() == 0 || cldFechaSentencia.getText().isEmpty() || cldReparto.getText().isEmpty()
                || cldHechos.getText().isEmpty() || txtNumeroCuadernos.getText().isEmpty() || txtJuzgado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene los campos obligatorios");

        } else {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

//        if (txtIdentificacion.getText().isEmpty() || txtNombreCondenado.getText().isEmpty()
//                || txtMesesPena.getText().isEmpty() || txtDiasPena.getText().isEmpty()
//                || txtMulta.getText().isEmpty() || txtAnoMulta.getText().isEmpty()
//                || cbSituacion.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(this, "Por favor llene bien los campos de la seccion pena");
//        } else {
//            JSONObject joPena = new JSONObject();
//            joPena.put("identificacionCondenado", txtIdentificacion.getText().trim());
//            joPena.put("nombreCondenado", txtNombreCondenado.getText().trim());
//            String pena = "";
//            int ano = Integer.parseInt(txtAnoMulta.getText().trim());
//            int mes = Integer.parseInt(txtMesesPena.getText().trim());
//            int dia = Integer.parseInt(txtDiasPena.getText().trim());
//            if (ano != 0) {
//                pena += "AÑOS: " + ano;
//            }
//            if (mes != 0) {
//                pena += " MESES: " + mes;
//            }
//            if (dia != 0) {
//                pena += " DIAS: " + dia;
//            } else {
//                JOptionPane.showMessageDialog(null, "Por favor ingresar un valor considerable en pena");
//                return;
//            }
//            joPena.put("tiempoPena", pena);
//            joPena.put("penaMulta", txtMulta.getText().trim());
//            joPena.put("diasPena", dia + (mes * 30) + (ano * 365));
//            joPena.put("procesosNI", JFrmInicio.cliente.get("proceso", "8323"));
//
//            System.out.println(joPena.toString());
//            CtlProceso proceso = new CtlProceso();
//            if (proceso.registrarPena(joPena)) {
//                JOptionPane.showMessageDialog(null, "Registro exitoso");
//            } else {
//                JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL REGISTRAR POR FAVOR REVISE EL SERVIDOR "
//                        + "O CONTACTE CON EL DESARROLLADOR");
//            }
//            limpiarCamposCondenados();
//        }

    }//GEN-LAST:event_jButton9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fallador;
    private javax.swing.JLabel Fallador1;
    private javax.swing.JButton btnAgregarProcesoAcumulado;
    private javax.swing.JButton btnAgregarProcesoAcumulado1;
    private javax.swing.JButton btnEliminarProcesoAcumulado;
    private javax.swing.JButton btnEliminarProcesoAcumulado1;
    private javax.swing.JComboBox<String> cbDelito;
    private javax.swing.JComboBox<String> cbDelito2;
    private javax.swing.JComboBox<String> cbOfendido;
    private javax.swing.JComboBox<String> cbSituacion;
    private javax.swing.JComboBox<String> cbfallador;
    private javax.swing.JComboBox<String> cbfallador2;
    private com.github.lgooddatepicker.components.DatePicker cldFechaSentencia;
    private com.github.lgooddatepicker.components.DatePicker cldFechaSentencia2;
    private com.github.lgooddatepicker.components.DatePicker cldHechos;
    private com.github.lgooddatepicker.components.DatePicker cldReparto;
    private com.github.lgooddatepicker.components.DatePicker cldingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListDelitos;
    private javax.swing.JList<String> jListDelitos1;
    private javax.swing.JList<String> jListDelitos2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblNI;
    private javax.swing.JList<String> lstAcumulados;
    private javax.swing.JList<String> lstRequerido;
    private javax.swing.JPanel pnlAvocase;
    private javax.swing.JTable tblCondenados;
    private javax.swing.JTextField txtAnoMulta;
    private javax.swing.JTextField txtDiasPena;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtJuzgado;
    private javax.swing.JTextField txtMesesPena;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNI;
    private javax.swing.JTextField txtNombreCondenado;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtNumero4;
    private javax.swing.JTextField txtNumero5;
    private javax.swing.JTextField txtNumero6;
    private javax.swing.JTextField txtNumeroCuadernos;
    private javax.swing.JTextField txtProcesoRequerido;
    private javax.swing.JTextField txtProcesoReuqrido;
    // End of variables declaration//GEN-END:variables

    public void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea salir?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
        }
    }

    public void limpiarProceso() {
        txtNumero.setText("");
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtNumero3.setText("");
        txtNumero4.setText("");
        txtNumero5.setText("");
        txtNumero6.setText("");
        txtNI.setText("");
        txtNumeroCuadernos.setText("");
        cbfallador.setSelectedIndex(0);
        cbfallador2.setSelectedIndex(0);
        cbOfendido.setSelectedIndex(0);
        cldFechaSentencia.setText("");
        cldFechaSentencia2.setText("");
        cldHechos.setText("");
        cldReparto.setText("");
        cldingreso.setText("");
        txtJuzgado.setText("PRIMERO DE EJECUCION DE PENAS Y MEDIDAS DE SEGURIDAD");

    }

    public void limpiarCamposCondenados() {
        txtIdentificacion.setText("");
        txtNombreCondenado.setText("");
        txtMesesPena.setText("");
        txtDiasPena.setText("");
        txtMulta.setText("");
        txtAnoMulta.setText("");
        cbDelito.setSelectedIndex(0);
        cbSituacion.setSelectedIndex(0);
        listaDelitos.clear();
    }

    private void solicitarOfendidos() {
//        cbOfendido.removeAllItems();
//        JSONArray array = JFrmInicio.cliente.get("ofendido");
//        cbOfendido.addItem("Seleccione un item");
//        for (Object delito : array) {
//            JSONObject joDelito = (JSONObject) delito;
//            cbOfendido.addItem(joDelito.get("idOfendidos") + " - " + joDelito.get("descripcion"));
//        }
    }

    private void solicitarFallador() {
//        cbfallador.removeAllItems();
//        cbfallador2.removeAllItems();
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

    private void solicitarDelitos() {
//        JSONArray array = JFrmInicio.cliente.get("delito");
//        cbDelito.addItem("Seleccione un delito");
//        for (Object delito : array) {
//            JSONObject joDelito = (JSONObject) delito;
//            cbDelito.addItem(joDelito.get("idDelitos") + " - " + joDelito.get("descripcion"));
//        }
    }

//    
//    public void minimizarVentana() {
//        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
//                KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.ALT_MASK), "iconifiable");
//        getRootPane().getActionMap().put("iconifiable", new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                minizar();
//            }
//        });
//    }
    public void cerrarVentana() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrar();
            }
        });
    }

}
