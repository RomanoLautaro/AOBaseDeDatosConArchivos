/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;

public class VerEmpleado extends javax.swing.JFrame {
    public void openInternet(){
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    /**
     * Creates new form Login
     */
    public VerEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelVolver = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelInternet = new javax.swing.JLabel();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabelMusica = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta13 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        Etiqueta14 = new javax.swing.JLabel();
        Etiqueta15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Etiqueta3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Etiqueta4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Etiqueta6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Etiqueta5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Etiqueta16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Etiqueta17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Etiqueta18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Etiqueta7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Etiqueta8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Etiqueta9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Etiqueta10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Etiqueta11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Etiqueta12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Etiqueta19 = new javax.swing.JLabel();
        Etiqueta20 = new javax.swing.JLabel();
        Etiqueta21 = new javax.swing.JLabel();
        Etiqueta22 = new javax.swing.JLabel();
        Etiqueta23 = new javax.swing.JLabel();
        Etiqueta24 = new javax.swing.JLabel();
        jLHorarios = new javax.swing.JLabel();
        jLObservaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        jLabelVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_32px.png"))); // NOI18N
        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Globe_32px.png"))); // NOI18N
        jLabelInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInternetMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 10, -1, -1));

        jLabelCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        jLabelCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalculadoraMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 50, -1, -1));

        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Musical_Notes_32px.png"))); // NOI18N
        jPanel2.add(jLabelMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 90, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setText("Area Programatica");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setText("Area Operativa");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setText("Funcion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setText("Nivel");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setText("Cargo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        Etiqueta1.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta1.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta1.setText("Label");
        jPanel2.add(Etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        Etiqueta13.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta13.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta13.setText("Label");
        jPanel2.add(Etiqueta13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        Etiqueta2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta2.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta2.setText("Label");
        jPanel2.add(Etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        Etiqueta14.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta14.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta14.setText("Label");
        jPanel2.add(Etiqueta14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        Etiqueta15.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta15.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta15.setText("Label");
        jPanel2.add(Etiqueta15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel11.setText("Establecimiento");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        Etiqueta3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta3.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta3.setText("Label");
        jPanel2.add(Etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel12.setText("Apellido");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        Etiqueta4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta4.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta4.setText("Label");
        jPanel2.add(Etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel13.setText("DNI");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, -1, -1));

        Etiqueta6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta6.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta6.setText("Label");
        jPanel2.add(Etiqueta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, -1, -1));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel16.setText("Nombres");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        Etiqueta5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta5.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta5.setText("Label");
        jPanel2.add(Etiqueta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, -1, -1));

        jLabel17.setBackground(new java.awt.Color(153, 153, 153));
        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel17.setText("Escolaridad");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        Etiqueta16.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta16.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta16.setText("Label");
        jPanel2.add(Etiqueta16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel18.setText("Especialidad");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        Etiqueta17.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta17.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta17.setText("Label");
        jPanel2.add(Etiqueta17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, -1, -1));

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel19.setText("Funcion jerarquica");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, -1, -1));

        Etiqueta18.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta18.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta18.setText("Label");
        jPanel2.add(Etiqueta18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, -1, -1));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel20.setText("Fecha de nacimiento");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        Etiqueta7.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta7.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta7.setText("Label");
        jPanel2.add(Etiqueta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel21.setText("Edad");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        Etiqueta8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta8.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta8.setText("Label");
        jPanel2.add(Etiqueta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel6.setText("Fecha ingreso");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        Etiqueta9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta9.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta9.setText("Label");
        jPanel2.add(Etiqueta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel22.setText("Antiguedad");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        Etiqueta10.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta10.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta10.setText("Label");
        jPanel2.add(Etiqueta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel23.setText("Afiliado");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        Etiqueta11.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta11.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta11.setText("Label");
        jPanel2.add(Etiqueta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, -1, -1));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel24.setText("Nro de matricula");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, -1, -1));

        Etiqueta12.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta12.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta12.setText("Label");
        jPanel2.add(Etiqueta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 180, -1, -1));

        jLabel25.setBackground(new java.awt.Color(153, 153, 153));
        jLabel25.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel25.setText("Situacion de revista");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel26.setText("Guardia rotatoria");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel27.setBackground(new java.awt.Color(153, 153, 153));
        jLabel27.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel27.setText("Libre Disponibilidad");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel28.setBackground(new java.awt.Color(153, 153, 153));
        jLabel28.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel28.setText("Numero");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel29.setText("Fecha");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel30.setText("Otros");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, -1, -1));

        Etiqueta19.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta19.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta19.setText("Label");
        jPanel2.add(Etiqueta19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        Etiqueta20.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta20.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta20.setText("Label");
        jPanel2.add(Etiqueta20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        Etiqueta21.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta21.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta21.setText("Label");
        jPanel2.add(Etiqueta21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        Etiqueta22.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta22.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta22.setText("Label");
        jPanel2.add(Etiqueta22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        Etiqueta23.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta23.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta23.setText("Label");
        jPanel2.add(Etiqueta23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, -1, -1));

        Etiqueta24.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Etiqueta24.setForeground(new java.awt.Color(102, 102, 102));
        Etiqueta24.setText("Label");
        jPanel2.add(Etiqueta24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, -1, -1));

        jLHorarios.setBackground(new java.awt.Color(153, 153, 153));
        jLHorarios.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLHorarios.setText("Horarios");
        jPanel2.add(jLHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        jLObservaciones.setBackground(new java.awt.Color(153, 153, 153));
        jLObservaciones.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLObservaciones.setText("Observaciones");
        jPanel2.add(jLObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int confirm = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar el programa?","Salir",dialog);
        
        if(confirm == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    
    private void jLabelInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInternetMouseClicked
        openInternet();
    }//GEN-LAST:event_jLabelInternetMouseClicked

    private void jLabelCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculadoraMouseClicked
        try {
            Runtime ret = Runtime.getRuntime();
            Process p = ret.exec("calc");
            p.waitFor();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_jLabelCalculadoraMouseClicked

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        Personal vistaProg = new Personal();
        vistaProg.setVisible(true);
        hide();
    }//GEN-LAST:event_jLabelVolverMouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Etiqueta1;
    public static javax.swing.JLabel Etiqueta10;
    public static javax.swing.JLabel Etiqueta11;
    public static javax.swing.JLabel Etiqueta12;
    public static javax.swing.JLabel Etiqueta13;
    public static javax.swing.JLabel Etiqueta14;
    public static javax.swing.JLabel Etiqueta15;
    public static javax.swing.JLabel Etiqueta16;
    public static javax.swing.JLabel Etiqueta17;
    public static javax.swing.JLabel Etiqueta18;
    public static javax.swing.JLabel Etiqueta19;
    public static javax.swing.JLabel Etiqueta2;
    public static javax.swing.JLabel Etiqueta20;
    public static javax.swing.JLabel Etiqueta21;
    public static javax.swing.JLabel Etiqueta22;
    public static javax.swing.JLabel Etiqueta23;
    public static javax.swing.JLabel Etiqueta24;
    public static javax.swing.JLabel Etiqueta3;
    public static javax.swing.JLabel Etiqueta4;
    public static javax.swing.JLabel Etiqueta5;
    public static javax.swing.JLabel Etiqueta6;
    public static javax.swing.JLabel Etiqueta7;
    public static javax.swing.JLabel Etiqueta8;
    public static javax.swing.JLabel Etiqueta9;
    private javax.swing.JLabel jLHorarios;
    private javax.swing.JLabel jLObservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelInternet;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
