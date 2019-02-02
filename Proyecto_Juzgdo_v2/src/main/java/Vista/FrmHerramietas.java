package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.json.simple.JSONObject;

/**
 *
 * @author sicg
 */
public class FrmHerramietas extends javax.swing.JInternalFrame {

//    private CtlFallador controladorFallador = new CtlFallador();
//    private CtlOfendido controladorOfendido = new CtlOfendido();
//    private CtlDerechos controladorDerechos = new CtlDerechos();
//    private CtlAuditoria controladorAuditoria = new CtlAuditoria();
//    private CtlDelitos controladorDelitos = new CtlDelitos();

    public static ArrayList<JSONObject> lstAuditorias = new ArrayList<>();

    public FrmHerramietas() {
        initComponents();
        try {
            cerrarVentana();
            btnBuscarAuditoria.setEnabled(false);
        } catch (Exception e) {
            System.out.println("[Error] : " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFallador = new javax.swing.JTable();
        btmEditarFallador = new javax.swing.JButton();
        btnRegistrarFallador = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDescripcionFallador = new javax.swing.JTextArea();
        btnListarFalladores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOfendido = new javax.swing.JTable();
        btmEditarOfendido = new javax.swing.JButton();
        btnRegistrarOfendido = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDescripcionOfendido = new javax.swing.JTextArea();
        btnListarOfendido = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDerechos = new javax.swing.JTable();
        btmEditarDerecho = new javax.swing.JButton();
        btnRegistrarDerechos = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtDescripcionDerecho = new javax.swing.JTextArea();
        btnListarFalladores1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDelitos = new javax.swing.JTable();
        btmEditarDelitos = new javax.swing.JButton();
        btnRegistrarDelitos = new javax.swing.JButton();
        rbAtributoUno = new javax.swing.JRadioButton();
        rbAtributoDos = new javax.swing.JRadioButton();
        rbAtributoTres = new javax.swing.JRadioButton();
        rbAtributoCuatro = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtDescripcionD = new javax.swing.JTextArea();
        btnListarFalladores2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btmEditarUsuarios = new javax.swing.JButton();
        btnRegistrarUsuarios = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAuditoria = new javax.swing.JTable();
        cldFecha = new com.toedter.calendar.JDateChooser();
        btnBuscarAuditoria = new javax.swing.JButton();
        btnListarAuditorias = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("HERRAMIENTAS");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1273, 620));
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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(179, 231, 179));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("DESCRIPCION:");

        tblFallador.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblFallador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        tblFallador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFalladorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFallador);
        if (tblFallador.getColumnModel().getColumnCount() > 0) {
            tblFallador.getColumnModel().getColumn(0).setResizable(false);
            tblFallador.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        btmEditarFallador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btmEditarFallador.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\editarr.png")); // NOI18N
        btmEditarFallador.setText("EDITAR");
        btmEditarFallador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarFalladorActionPerformed(evt);
            }
        });

        btnRegistrarFallador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarFallador.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\mas.png")); // NOI18N
        btnRegistrarFallador.setText("REGISTRAR");
        btnRegistrarFallador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFalladorActionPerformed(evt);
            }
        });

        txtDescripcionFallador.setColumns(5);
        txtDescripcionFallador.setLineWrap(true);
        txtDescripcionFallador.setRows(5);
        txtDescripcionFallador.setAutoscrolls(false);
        jScrollPane7.setViewportView(txtDescripcionFallador);

        btnListarFalladores.setText("Cargar Falladores");
        btnListarFalladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFalladoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarFallador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmEditarFallador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarFalladores, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnListarFalladores, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmEditarFallador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarFallador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FALLADOR", jPanel1);

        jPanel3.setBackground(new java.awt.Color(231, 179, 196));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("DESCRIPCION:");

        tblOfendido.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblOfendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        tblOfendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOfendidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOfendido);
        if (tblOfendido.getColumnModel().getColumnCount() > 0) {
            tblOfendido.getColumnModel().getColumn(0).setResizable(false);
            tblOfendido.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        btmEditarOfendido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btmEditarOfendido.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\editarr.png")); // NOI18N
        btmEditarOfendido.setText("EDITAR");
        btmEditarOfendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarOfendidoActionPerformed(evt);
            }
        });

        btnRegistrarOfendido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarOfendido.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\mas.png")); // NOI18N
        btnRegistrarOfendido.setText("REGISTRAR");
        btnRegistrarOfendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOfendidoActionPerformed(evt);
            }
        });

        txtDescripcionOfendido.setColumns(5);
        txtDescripcionOfendido.setLineWrap(true);
        txtDescripcionOfendido.setRows(5);
        jScrollPane8.setViewportView(txtDescripcionOfendido);

        btnListarOfendido.setText("Cargar Ofendido");
        btnListarOfendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarOfendidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmEditarOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarOfendido, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnListarOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmEditarOfendido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1252, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OFENDIDO", jPanel2);

        jPanel4.setBackground(new java.awt.Color(179, 207, 231));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("DESCRIPCION:");

        tblDerechos.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblDerechos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        tblDerechos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDerechosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDerechos);
        if (tblDerechos.getColumnModel().getColumnCount() > 0) {
            tblDerechos.getColumnModel().getColumn(0).setResizable(false);
            tblDerechos.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        btmEditarDerecho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btmEditarDerecho.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\editarr.png")); // NOI18N
        btmEditarDerecho.setText("EDITAR");
        btmEditarDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarDerechoActionPerformed(evt);
            }
        });

        btnRegistrarDerechos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarDerechos.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\mas.png")); // NOI18N
        btnRegistrarDerechos.setText("REGISTRAR");
        btnRegistrarDerechos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDerechosActionPerformed(evt);
            }
        });

        txtDescripcionDerecho.setColumns(5);
        txtDescripcionDerecho.setLineWrap(true);
        txtDescripcionDerecho.setRows(5);
        jScrollPane9.setViewportView(txtDescripcionDerecho);

        btnListarFalladores1.setText("Cargar Derechos");
        btnListarFalladores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFalladores1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarDerechos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmEditarDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarFalladores1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnListarFalladores1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarDerechos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmEditarDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DERECHOS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(231, 219, 179));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("DESCRIPCION:");

        tblDelitos.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblDelitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "DESCRIPCION", "D.38B", "D.38G", "LC.64", "DCF"
            }
        ));
        tblDelitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDelitosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDelitos);

        btmEditarDelitos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btmEditarDelitos.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\editarr.png")); // NOI18N
        btmEditarDelitos.setText("EDITAR");
        btmEditarDelitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarDelitosActionPerformed(evt);
            }
        });

        btnRegistrarDelitos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarDelitos.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\mas.png")); // NOI18N
        btnRegistrarDelitos.setText("REGISTRAR");
        btnRegistrarDelitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDelitosActionPerformed(evt);
            }
        });

        rbAtributoUno.setBackground(new java.awt.Color(231, 219, 179));
        rbAtributoUno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbAtributoUno.setText("D.38B");
        rbAtributoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtributoUnoActionPerformed(evt);
            }
        });

        rbAtributoDos.setBackground(new java.awt.Color(231, 219, 179));
        rbAtributoDos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbAtributoDos.setText("D.38G");

        rbAtributoTres.setBackground(new java.awt.Color(231, 219, 179));
        rbAtributoTres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbAtributoTres.setText("LC.64");

        rbAtributoCuatro.setBackground(new java.awt.Color(231, 219, 179));
        rbAtributoCuatro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbAtributoCuatro.setText("DCF");

        txtDescripcionD.setColumns(20);
        txtDescripcionD.setRows(5);
        jScrollPane10.setViewportView(txtDescripcionD);

        btnListarFalladores2.setText("Cargar Derechos");
        btnListarFalladores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFalladores2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rbAtributoUno)
                                .addGap(18, 18, 18)
                                .addComponent(rbAtributoTres))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rbAtributoDos)
                                .addGap(18, 18, 18)
                                .addComponent(rbAtributoCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarFalladores2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarDelitos)
                        .addGap(18, 18, 18)
                        .addComponent(btmEditarDelitos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAtributoUno)
                            .addComponent(rbAtributoTres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAtributoDos)
                            .addComponent(rbAtributoCuatro)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnListarFalladores2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRegistrarDelitos)
                                .addComponent(btmEditarDelitos)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DELITOS", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 153, 248));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("USUARIO:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("CONTRASEÑA:");

        txtContrasena.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        tblUsuarios.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "USUARIO", "CONTRASEÑA", "NOMBRE COMPLETO"
            }
        ));
        jScrollPane5.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        btmEditarUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btmEditarUsuarios.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\editarr.png")); // NOI18N
        btmEditarUsuarios.setText("EDITAR");
        btmEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarUsuariosActionPerformed(evt);
            }
        });

        btnRegistrarUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarUsuarios.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\mas.png")); // NOI18N
        btnRegistrarUsuarios.setText("REGISTRAR");
        btnRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuariosActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("NOMBRE COMPLETO");

        txtNombreCompleto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtNombreCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreCompletoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(btmEditarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btmEditarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(btnRegistrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("USUARIOS", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 193, 153));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("FECHA:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("NOMBRE COMPLETO");

        txtBuscarNombre.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyPressed(evt);
            }
        });

        tblAuditoria.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tblAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "USUARIO", "CONTRASEÑA", "NOMBRE COMPLETO"
            }
        ));
        jScrollPane6.setViewportView(tblAuditoria);
        if (tblAuditoria.getColumnModel().getColumnCount() > 0) {
            tblAuditoria.getColumnModel().getColumn(0).setResizable(false);
            tblAuditoria.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        cldFecha.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        btnBuscarAuditoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscarAuditoria.setIcon(new javax.swing.ImageIcon("C:\\tmp\\img\\BUSCAR.png")); // NOI18N
        btnBuscarAuditoria.setText("BUSCAR");
        btnBuscarAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAuditoriaActionPerformed(evt);
            }
        });

        btnListarAuditorias.setText("Cargar Auditorias");
        btnListarAuditorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAuditoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnListarAuditorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarAuditoria))
                    .addComponent(btnListarAuditorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AUDITORIA", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrar();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btmEditarFalladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarFalladorActionPerformed
//        String descripcion;
//        try {
//            if (tblFallador.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun fallador de la tabla para poder editar");
//                throw new NullPointerException("Debe seleccionarse un fallador de la tabla para poder editar");
//            }
//            descripcion = txtDescripcionFallador.getText().trim().toUpperCase();
//            if (controladorFallador.modificar(descripcion, tblFallador.getSelectedRow())) {
//                JOptionPane.showMessageDialog(null, "Se ha modificado un falldor con exito");
//                tblFallador.setModel(controladorFallador.listar());
//                txtDescripcionFallador.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido modificar el fallador");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btmEditarFalladorActionPerformed

    private void btnRegistrarFalladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFalladorActionPerformed
//        String descripcion;
//        try {
//            descripcion = txtDescripcionFallador.getText().trim().toUpperCase();
//            if (controladorFallador.registrar(descripcion)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el falldor con exito");
//                tblFallador.setModel(controladorFallador.listar());
//                txtDescripcionFallador.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el fallador");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btnRegistrarFalladorActionPerformed

    private void btmEditarOfendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarOfendidoActionPerformed
//        String descripcion;
//        try {
//            if (tblOfendido.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun ofendido de la tabla para poder editar");
//                throw new NullPointerException("Debe seleccionarse un ofendido de la tabla para poder editar");
//            }
//            descripcion = txtDescripcionOfendido.getText().trim().toUpperCase();
//            if (controladorOfendido.modificar(descripcion, tblOfendido.getSelectedRow())) {
//                JOptionPane.showMessageDialog(null, "Se ha modificado un ofendido con exito");
//                tblOfendido.setModel(controladorOfendido.listar());
//                txtDescripcionOfendido.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido modificar el ofendido");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btmEditarOfendidoActionPerformed

    private void btnRegistrarOfendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOfendidoActionPerformed
//        String descripcion;
//        try {
//            descripcion = txtDescripcionOfendido.getText().trim().toUpperCase();
//            if (controladorOfendido.registrar(descripcion)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el ofendido con exito");
//                tblOfendido.setModel(controladorOfendido.listar());
//                txtDescripcionOfendido.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el ofendido");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btnRegistrarOfendidoActionPerformed

    private void btmEditarDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarDerechoActionPerformed
//        String descripcion;
//        try {
//            if (tblDerechos.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun derecho de la tabla para poder editar");
//                throw new NullPointerException("Debe seleccionarse un derecho de la tabla para poder editar");
//            }
//            descripcion = txtDescripcionDerecho.getText().trim().toUpperCase();
//            if (controladorDerechos.modificar(descripcion, tblDerechos.getSelectedRow())) {
//                JOptionPane.showMessageDialog(null, "Se ha modificado un derecho con exito");
//                tblDerechos.setModel(controladorDerechos.listar());
//                txtDescripcionDerecho.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido modificar el derecho");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btmEditarDerechoActionPerformed

    private void btnRegistrarDerechosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDerechosActionPerformed
//        String descripcion;
//        try {
//            descripcion = txtDescripcionDerecho.getText().trim().toUpperCase();
//            if (controladorDerechos.registrar(descripcion)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el derecho con exito");
//                tblDerechos.setModel(controladorDerechos.listar());
//                txtDescripcionDerecho.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el derecho");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btnRegistrarDerechosActionPerformed

    private void btmEditarDelitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarDelitosActionPerformed
//        String descripcion;
//        String atributo1 = "-";
//        String atributo2 = "-";
//        String atributo3 = "-";
//        String atributo4 = "-";
//        try {
//            if (tblDelitos.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun delito de la tabla para poder editar");
//                throw new NullPointerException("Debe seleccionarse un delito de la tabla para poder editar");
//            }
//            descripcion = txtDescripcionD.getText().trim().toUpperCase();
//            if (rbAtributoUno.isSelected()) {
//                atributo1 = "D.38B";
//            }
//            if (rbAtributoDos.isSelected()) {
//                atributo2 = "D.38G";
//            }
//            if (rbAtributoTres.isSelected()) {
//                atributo3 = "LC.64";
//            }
//            if (rbAtributoCuatro.isSelected()) {
//                atributo4 = "DCF";
//            }
//            if (controladorDelitos.modificar(descripcion, tblDelitos.getSelectedRow(), atributo1, atributo2, atributo3, atributo4)) {
//                JOptionPane.showMessageDialog(null, "Se ha modificado un delito con exito");
//                tblDelitos.setModel(controladorDelitos.listar());
//                txtDescripcionD.setText("");
//                rbAtributoUno.setSelected(false);
//                rbAtributoDos.setSelected(false);
//                rbAtributoTres.setSelected(false);
//                rbAtributoCuatro.setSelected(false);
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido modificar el delito");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btmEditarDelitosActionPerformed

    private void btnRegistrarDelitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDelitosActionPerformed
//        String descripcion;
//        String atributo1 = "-";
//        String atributo2 = "-";
//        String atributo3 = "-";
//        String atributo4 = "-";
//        try {
//            descripcion = txtDescripcionD.getText().trim().toUpperCase();
//            if (rbAtributoUno.isSelected()) {
//                atributo1 = "D.38B";
//            }
//            if (rbAtributoDos.isSelected()) {
//                atributo2 = "D.38G";
//            }
//            if (rbAtributoTres.isSelected()) {
//                atributo3 = "LC.64";
//            }
//            if (rbAtributoCuatro.isSelected()) {
//                atributo4 = "DCF";
//            }
//            if (controladorDelitos.registrar(descripcion, atributo1, atributo2, atributo3, atributo4)) {
//                JOptionPane.showMessageDialog(null, "Se ha registrado el delito con exito");
//                tblDelitos.setModel(controladorDelitos.listar());
//                txtDescripcionD.setText("");
//                rbAtributoUno.setSelected(false);
//                rbAtributoDos.setSelected(false);
//                rbAtributoTres.setSelected(false);
//                rbAtributoCuatro.setSelected(false);
//            } else {
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar el delito");
//            }
//        } catch (Exception e) {
//            System.out.println("[ERROR] : " + e);
//            JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación");
//        }
    }//GEN-LAST:event_btnRegistrarDelitosActionPerformed

    private void rbAtributoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtributoUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtributoUnoActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void btmEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmEditarUsuariosActionPerformed

    private void btnRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarUsuariosActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtNombreCompletoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCompletoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompletoKeyPressed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void txtBuscarNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreKeyPressed

    private void tblFalladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFalladorMouseClicked
        int row = tblFallador.getSelectedRow();
        if (row >= 0) {
            txtDescripcionFallador.setText(tblFallador.getValueAt(row, 0).toString());
        }
    }//GEN-LAST:event_tblFalladorMouseClicked

    private void tblOfendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOfendidoMouseClicked
        int row = tblOfendido.getSelectedRow();
        if (row >= 0) {
            txtDescripcionOfendido.setText(tblOfendido.getValueAt(row, 0).toString());
        }
    }//GEN-LAST:event_tblOfendidoMouseClicked

    private void tblDerechosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDerechosMouseClicked
        int row = tblDerechos.getSelectedRow();
        if (row >= 0) {
            txtDescripcionDerecho.setText(tblDerechos.getValueAt(row, 0).toString());
        }
    }//GEN-LAST:event_tblDerechosMouseClicked

    private void btnListarAuditoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAuditoriasActionPerformed
//        tblAuditoria.setModel(controladorAuditoria.listar(true));
//        btnBuscarAuditoria.setEnabled(true);
    }//GEN-LAST:event_btnListarAuditoriasActionPerformed

    private void btnBuscarAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAuditoriaActionPerformed
//        if (cldFecha.getDate() != null) {
//            lstAuditorias = new ArrayList<>(lstAuditorias.stream().filter((JSONObject variable) -> new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.parseLong(variable.get("fecha").toString()))).contains(new SimpleDateFormat("yyyy-MM-dd").format(cldFecha.getDate()))).collect(Collectors.toList()));
//        }
//        if (!txtBuscarNombre.getText().isEmpty()) {
//            lstAuditorias = new ArrayList<>(lstAuditorias.stream().filter(variable -> variable.get("persona").toString().contains(txtBuscarNombre.getText().trim())).collect(Collectors.toList()));
//        }
//        tblAuditoria.setModel(controladorAuditoria.listar(false));
//        txtBuscarNombre.setText("");
//        cldFecha.setDate(null);
//        btnBuscarAuditoria.setEnabled(false);
    }//GEN-LAST:event_btnBuscarAuditoriaActionPerformed

    private void btnListarFalladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFalladoresActionPerformed
//        tblFallador.setModel(controladorFallador.listar());
    }//GEN-LAST:event_btnListarFalladoresActionPerformed

    private void btnListarOfendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarOfendidoActionPerformed
//        tblOfendido.setModel(controladorOfendido.listar());
    }//GEN-LAST:event_btnListarOfendidoActionPerformed

    private void btnListarFalladores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFalladores1ActionPerformed
//        tblDerechos.setModel(controladorDerechos.listar());
    }//GEN-LAST:event_btnListarFalladores1ActionPerformed

    private void tblDelitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDelitosMouseClicked
        int row = tblDelitos.getSelectedRow();
        if (row >= 0) {
            txtDescripcionD.setText(tblDelitos.getValueAt(row, 0).toString());
            rbAtributoUno.setSelected(!"-".equals(tblDelitos.getValueAt(row, 1).toString()));
            rbAtributoDos.setSelected(!"-".equals(tblDelitos.getValueAt(row, 2).toString()));
            rbAtributoTres.setSelected(!"-".equals(tblDelitos.getValueAt(row, 3).toString()));
            rbAtributoCuatro.setSelected(!"-".equals(tblDelitos.getValueAt(row, 4).toString()));
        }
    }//GEN-LAST:event_tblDelitosMouseClicked

    private void btnListarFalladores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFalladores2ActionPerformed
//        tblDelitos.setModel(controladorDelitos.listar());
    }//GEN-LAST:event_btnListarFalladores2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmEditarDelitos;
    private javax.swing.JButton btmEditarDerecho;
    private javax.swing.JButton btmEditarFallador;
    private javax.swing.JButton btmEditarOfendido;
    private javax.swing.JButton btmEditarUsuarios;
    private javax.swing.JButton btnBuscarAuditoria;
    private javax.swing.JButton btnListarAuditorias;
    private javax.swing.JButton btnListarFalladores;
    private javax.swing.JButton btnListarFalladores1;
    private javax.swing.JButton btnListarFalladores2;
    private javax.swing.JButton btnListarOfendido;
    private javax.swing.JButton btnRegistrarDelitos;
    private javax.swing.JButton btnRegistrarDerechos;
    private javax.swing.JButton btnRegistrarFallador;
    private javax.swing.JButton btnRegistrarOfendido;
    private javax.swing.JButton btnRegistrarUsuarios;
    private com.toedter.calendar.JDateChooser cldFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbAtributoCuatro;
    private javax.swing.JRadioButton rbAtributoDos;
    private javax.swing.JRadioButton rbAtributoTres;
    private javax.swing.JRadioButton rbAtributoUno;
    private javax.swing.JTable tblAuditoria;
    private javax.swing.JTable tblDelitos;
    private javax.swing.JTable tblDerechos;
    private javax.swing.JTable tblFallador;
    private javax.swing.JTable tblOfendido;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextArea txtDescripcionD;
    private javax.swing.JTextArea txtDescripcionDerecho;
    private javax.swing.JTextArea txtDescripcionFallador;
    private javax.swing.JTextArea txtDescripcionOfendido;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    public void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea salir?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {
        }
    }

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
