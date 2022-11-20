/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

/**
 *
 * @author Raul Gomez
 */
public class RegistrarClientes extends javax.swing.JFrame {

    String user;

    /**
     * Creates new form RegistrarClientes
     */
    public RegistrarClientes() {
        initComponents();
        user = Login.user;

        setSize(530, 350);
        setResizable(false);
        setTitle("Registrar nuevo cliente - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/BlancoMetalico.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image redValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/iconN.png"));
        return redValue;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jButton_agregar = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(51, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(51, 153, 255));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(51, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registrar Cliente");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 140, -1));

        txt_direccion.setBackground(new java.awt.Color(51, 153, 255));
        txt_direccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        jButton_agregar.setBackground(new java.awt.Color(51, 153, 255));
        jButton_agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_agregar.setForeground(new java.awt.Color(102, 102, 102));
        jButton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_registro.png"))); // NOI18N
        jButton_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_agregar.setOpaque(false);
        jButton_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 140, 100));

        jLabel_footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_footer.setText("Creado por Raúl Gómez");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 530, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed

//        int permisos_cmb, validacion = 0;
//        String nombre, mail, telefono, username, pass, permiso_string="";
//
//        mail = txt_mail.getText().trim();
//        username = txt_username.getText().trim();
//        pass = txt_password.getText().trim();
//        nombre = txt_nombre.getText().trim();
//        telefono = txt_telefono.getText().trim();
//
//        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
//
//        if (mail.equals("")) {
//            txt_mail.setBackground(Color.RED);
//            validacion++;
//        }
//        if (username.equals("")) {
//            txt_username.setBackground(Color.RED);
//            validacion++;
//        }
//        if (pass.equals("")) {
//            txt_password.setBackground(Color.RED);
//            validacion++;
//        }
//        if (nombre.equals("")) {
//            txt_nombre.setBackground(Color.RED);
//            validacion++;
//        }
//        if (telefono.equals("")) {
//            txt_telefono.setBackground(Color.RED);
//            validacion++;
//        }
//
//        switch (permisos_cmb) {
//            case 1:
//            permiso_string = "Administrador";
//            break;
//            case 2:
//            permiso_string = "Capturista";
//            break;
//            case 3:
//            permiso_string = "Tecnico";
//            break;
//            default:
//            break;
//        }
//        try {
//            Connection cn = Conexion.conectar();
//            PreparedStatement pst = cn.prepareStatement("select username from usuarios where username = '" + username + "'");
//            ResultSet rs = pst.executeQuery();
//
//            if (rs.next()) {
//                txt_username.setBackground(Color.RED);
//                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
//                cn.close();
//            } else {
//                cn.close();
//
//                if (validacion == 0) {
//                    try {
//
//                        Connection cn2 = Conexion.conectar();
//
//                        PreparedStatement pst2 = cn2.prepareStatement(
//                            "insert into usuarios values (?,?,?,?,?,?,?,?,?)");
//                        pst2.setInt(1, 0);
//                        pst2.setString(2, nombre);
//                        pst2.setString(3, mail);
//                        pst2.setString(4, telefono);
//                        pst2.setString(5, username);
//                        pst2.setString(6, pass);
//                        pst2.setString(7, permiso_string);
//                        pst2.setString(8, "Activo");
//                        pst2.setString(9, user);
//
//                        pst2.executeUpdate();
//                        cn2.close();
//
//                        limpiar();
//
//                        txt_mail.setBackground(Color.green);
//                        txt_username.setBackground(Color.green);
//                        txt_password.setBackground(Color.green);
//                        txt_nombre.setBackground(Color.green);
//                        txt_telefono.setBackground(Color.green);
//
//                        JOptionPane.showMessageDialog(null, "Registro exitoso.");
//                        this.dispose();
//
//                    } catch (HeadlessException | SQLException e) {
//                        System.err.println("Error en Registrar usuario. " + e);
//                        JOptionPane.showMessageDialog(null, "¡¡ERROR, al registrar!!, contacte al administrador.");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
//                }
//
//            }
//        } catch (HeadlessException | SQLException e) {
//            System.err.println("Error en validar nombre de usuario. " + e);
//            JOptionPane.showMessageDialog(null, "¡¡ERROR, al comparar usuario!!, contacte al administrador.");
//        }
    }//GEN-LAST:event_jButton_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
