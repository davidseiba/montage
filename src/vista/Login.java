
package vista;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpServicio = new javax.swing.ButtonGroup();
        panContenedor = new javax.swing.JPanel();
        PanLeft = new javax.swing.JPanel();
        panChecks = new javax.swing.JPanel();
        panCheckEmpleado = new javax.swing.JPanel();
        optEmpleado = new javax.swing.JCheckBox();
        panCheckProveedor = new javax.swing.JPanel();
        optServicio = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblLogo = new javax.swing.JLabel();
        panTop = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        panSemiCentral = new javax.swing.JPanel();
        panInicioSesion = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanLeft.setBackground(new java.awt.Color(153, 0, 0));
        PanLeft.setForeground(new java.awt.Color(255, 255, 255));
        PanLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panChecks.setBackground(new java.awt.Color(153, 0, 0));
        panChecks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panCheckEmpleado.setBackground(new java.awt.Color(0, 0, 0));

        btngrpServicio.add(optEmpleado);
        optEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        optEmpleado.setText("Empleado");
        optEmpleado.setOpaque(false);

        javax.swing.GroupLayout panCheckEmpleadoLayout = new javax.swing.GroupLayout(panCheckEmpleado);
        panCheckEmpleado.setLayout(panCheckEmpleadoLayout);
        panCheckEmpleadoLayout.setHorizontalGroup(
            panCheckEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckEmpleadoLayout.createSequentialGroup()
                .addComponent(optEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panCheckEmpleadoLayout.setVerticalGroup(
            panCheckEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckEmpleadoLayout.createSequentialGroup()
                .addComponent(optEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panChecks.add(panCheckEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, -1));

        panCheckProveedor.setBackground(new java.awt.Color(0, 0, 0));

        btngrpServicio.add(optServicio);
        optServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optServicio.setForeground(new java.awt.Color(255, 255, 255));
        optServicio.setText("Servicio");
        optServicio.setOpaque(false);

        javax.swing.GroupLayout panCheckProveedorLayout = new javax.swing.GroupLayout(panCheckProveedor);
        panCheckProveedor.setLayout(panCheckProveedorLayout);
        panCheckProveedorLayout.setHorizontalGroup(
            panCheckProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCheckProveedorLayout.createSequentialGroup()
                .addComponent(optServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        panCheckProveedorLayout.setVerticalGroup(
            panCheckProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCheckProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(optServicio))
        );

        panChecks.add(panCheckProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        panChecks.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        panChecks.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 10));

        PanLeft.add(panChecks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 220));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logMonCirChico.png"))); // NOI18N
        PanLeft.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panContenedor.add(PanLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 500));

        panTop.setBackground(new java.awt.Color(204, 0, 51));
        panTop.setForeground(new java.awt.Color(0, 51, 102));
        panTop.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panTopMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panTopMouseMoved(evt);
            }
        });
        panTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panTopMousePressed(evt);
            }
        });

        lblIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarSesion.setText("Iniciar Sesión");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(lblIniciarSesion)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblIniciarSesion)
                .addContainerGap())
        );

        panContenedor.add(panTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 700, 60));

        panSemiCentral.setBackground(new java.awt.Color(255, 255, 255));
        panSemiCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panSemiCentral.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panSemiCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panInicioSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificate y inicia sesión.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panInicioSesion.setForeground(new java.awt.Color(0, 51, 102));
        panInicioSesion.setOpaque(false);
        panInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        lblUsuario.setText("Usuario:");
        panInicioSesion.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI Light", 1, 15)); // NOI18N
        lblContraseña.setText("Contraseña:");
        panInicioSesion.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtUsuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Digita tu usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panInicioSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 30));

        btnEntrar.setBackground(new java.awt.Color(153, 0, 0));
        btnEntrar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panInicioSesion.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, 30));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("jPa");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        panInicioSesion.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 30));
        panInicioSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, -1));
        panInicioSesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, -1));

        panSemiCentral.add(panInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 370, 310));

        panContenedor.add(panSemiCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 700, 440));

        getContentPane().add(panContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        // Borrar texto password y colocar texto en user
        txtPassword.setText("");
        txtPassword.setForeground(Color.black);
    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // Borra texto usuario y coloca en password
        txtUsuario.setText("");
        txtUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void panTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panTopMousePressed
        // movimiento mouse
    }//GEN-LAST:event_panTopMousePressed

    private void panTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panTopMouseDragged

        
    }//GEN-LAST:event_panTopMouseDragged

    private void panTopMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panTopMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panTopMouseMoved

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Boton para entrar al sistema
        String usuario = txtUsuario.getText(); // guardo usuario desde formulario
        String passwordAcceso = txtPassword.getText(); // guardo password desde formulario
        
        if (optServicio.isSelected()) { // inicia if para administrador
            if (usuario.equals("servicio123")&&passwordAcceso.equals("servicio123")) { // inicia if para usuario y contraseña correctos
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema Servicio :" + usuario );
                Proveedores ventanaProveedor = new Proveedores(); // llamada de la clase ventana libros captura libros
                ventanaProveedor.setVisible(true); // se hace visible la ventana o clase
                this.hide(); // oculta ventana anterior
            } else {
                    JOptionPane.showMessageDialog(null, "Error verifica tus datos");
                    // limpia campos
                    txtUsuario.setText("");
                    txtPassword.setText("");
            }
        } // termina if para administrador
        
               if (optEmpleado.isSelected()) { // inicia if para administrador
            if (usuario.equals("empleado123")&&passwordAcceso.equals("empleado123")) { // inicia if para usuario y contraseña correctos
                JOptionPane.showMessageDialog(null, "Bienvenido a Sistema Hoteleria :" + usuario );
                Empleado ventanaEmpleado = new Empleado(); // llamada de la clase ventana libros ventanaLibros
                ventanaEmpleado.setVisible(true); // se hace visible la ventana o clase
                this.hide(); // oculta ventana anterior
            } else {
                    JOptionPane.showMessageDialog(null, "Error verifica tus datos");
                    // limpia campos
                    txtUsuario.setText("");
                    txtPassword.setText("");
            }
        } // termina if para administrador
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanLeft;
    private javax.swing.JButton btnEntrar;
    private javax.swing.ButtonGroup btngrpServicio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JCheckBox optEmpleado;
    private javax.swing.JCheckBox optServicio;
    private javax.swing.JPanel panCheckEmpleado;
    private javax.swing.JPanel panCheckProveedor;
    private javax.swing.JPanel panChecks;
    private javax.swing.JPanel panContenedor;
    private javax.swing.JPanel panInicioSesion;
    private javax.swing.JPanel panSemiCentral;
    private javax.swing.JPanel panTop;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
