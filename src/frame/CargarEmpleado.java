/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import javax.swing.JOptionPane;
import controladores.ControladorCargarEmpleado;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author lauta
 */
public class CargarEmpleado extends javax.swing.JFrame {
    ControladorCargarEmpleado controlador = new ControladorCargarEmpleado();
    /**
     * Creates new form Login
     */
    public CargarEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
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
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAreaObservacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAreaDeTrabajo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLegajo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelGuardarSinFoto = new javax.swing.JLabel();
        jTextFieldDni1 = new javax.swing.JTextField();

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
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabelVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_32px.png"))); // NOI18N
        jLabelVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVolverMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

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
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 30));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, -1));

        jLabelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_96px_2.png"))); // NOI18N
        jLabelImg.setToolTipText("");
        jLabelImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jPanel2.add(jLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 160));

        jTextFieldApellido.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 160, 30));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jTextAreaObservacion.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextAreaObservacion.setForeground(new java.awt.Color(102, 102, 102));
        jTextAreaObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextAreaObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAreaObservacionActionPerformed(evt);
            }
        });
        jPanel2.add(jTextAreaObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 410, 30));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setText("DNI");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jTextFieldAreaDeTrabajo.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextFieldAreaDeTrabajo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldAreaDeTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextFieldAreaDeTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaDeTrabajoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldAreaDeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 160, 30));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setText("Area de Trabajo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jTextFieldLegajo.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextFieldLegajo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldLegajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextFieldLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLegajoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 160, 30));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setText("Legajo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel9.setText("Observacion");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabelGuardarSinFoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGuardarSinFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGuardarSinFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_OFF_largo.png"))); // NOI18N
        jLabelGuardarSinFoto.setText("GUARDAR");
        jLabelGuardarSinFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelGuardarSinFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelGuardarSinFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGuardarSinFotoMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelGuardarSinFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 180, 30));

        jTextFieldDni1.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jTextFieldDni1.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldDni1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jTextFieldDni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDni1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 540));

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

    }//GEN-LAST:event_jLabelInternetMouseClicked

    private void jLabelCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculadoraMouseClicked
        try {
            Runtime ret = Runtime.getRuntime();
            Process p = ret.exec("calc");
            p.waitFor();
        } catch (IOException | InterruptedException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_jLabelCalculadoraMouseClicked

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextAreaObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAreaObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaObservacionActionPerformed

    private void jTextFieldAreaDeTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaDeTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAreaDeTrabajoActionPerformed

    private void jTextFieldLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLegajoActionPerformed

    private void jLabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVolverMouseClicked
        Prog1 vistaProg = new Prog1();
        vistaProg.setVisible(true);
        hide();
    }//GEN-LAST:event_jLabelVolverMouseClicked

    private void jLabelGuardarSinFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGuardarSinFotoMouseClicked
        controlador.guardarEmpeladoArchivoSinFoto();
    }//GEN-LAST:event_jLabelGuardarSinFotoMouseClicked

    private void jTextFieldDni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDni1ActionPerformed
        //controlador.guardarEmpeladoArchivoSinFoto();
    }//GEN-LAST:event_jTextFieldDni1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(CargarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CargarEmpleado().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelGuardarSinFoto;
    public static javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelInternet;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JLabel jLabelVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jTextAreaObservacion;
    public static javax.swing.JTextField jTextFieldApellido;
    public static javax.swing.JTextField jTextFieldAreaDeTrabajo;
    public static javax.swing.JTextField jTextFieldDni1;
    public static javax.swing.JTextField jTextFieldLegajo;
    public static javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
