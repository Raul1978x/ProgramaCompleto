/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static ventanas.Administrador.sesion_usuario;

/**
 *
 * @author Raul Gomez
 */
public class InformacionUsuario extends javax.swing.JFrame {

    String user = "", user_update;
    int ID;

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;

        setSize(630, 450);
        setResizable(false);
        setTitle("Información del usuario  " + user_update + " Sesión de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/BlancoMetalico.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jLabel_Titulo.setText("Información del usuario " + user_update);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID = rs.getInt("id_usuario");
                txt_nombre.setText(rs.getString("nombre_usuario"));
                txt_mail.setText(rs.getString("email"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_username.setText(rs.getString("username"));
                txt_Registrodopor.setText(rs.getString("registrado_por"));

                cmb_estatus.setSelectedItem(rs.getString("tipo_nivel"));
                cmb_niveles.setSelectedItem(rs.getString("estatus"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario. " + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar!!, contacte con el administrador.");
        }

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

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_nombre1 = new javax.swing.JLabel();
        jLabel_nombre2 = new javax.swing.JLabel();
        jLabel_nombre3 = new javax.swing.JLabel();
        jLabel_nombre4 = new javax.swing.JLabel();
        jLabel_nombre5 = new javax.swing.JLabel();
        jLabel_nombre6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_Registrodopor = new javax.swing.JTextField();
        cmb_estatus = new javax.swing.JComboBox<>();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton_RestaurarPassword = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Información de Usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 630, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre.setText("Nombre:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre1.setText("email");
        getContentPane().add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre2.setText("Telefono:");
        getContentPane().add(jLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_nombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre3.setText("Permisos de:");
        getContentPane().add(jLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_nombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre4.setText("Username:");
        getContentPane().add(jLabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel_nombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre5.setText("Estatus:");
        getContentPane().add(jLabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_nombre6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombre6.setText("Registrado por:");
        getContentPane().add(jLabel_nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(51, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

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

        txt_username.setBackground(new java.awt.Color(51, 153, 255));
        txt_username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_Registrodopor.setEditable(false);
        txt_Registrodopor.setBackground(new java.awt.Color(51, 153, 255));
        txt_Registrodopor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Registrodopor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Registrodopor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Registrodopor.setEnabled(false);
        getContentPane().add(txt_Registrodopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        cmb_estatus.setBackground(new java.awt.Color(51, 153, 255));
        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmb_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_estatusActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        cmb_niveles.setBackground(new java.awt.Color(51, 153, 255));
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        jButton_RestaurarPassword.setText("Restaurar Password");
        jButton_RestaurarPassword.setBorder(null);
        jButton_RestaurarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestaurarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 35));

        jButton_Actualizar.setText("Actualizar Usuario");
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, 35));

        jLabel_footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_footer.setText("Creado por Raúl Gómez");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 390, 630, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        int permisos_cmb, estatus_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_String = "", estatus_String = "";

        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        telefono = txt_telefono.getText().trim();
        nombre = txt_nombre.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
        estatus_cmb = cmb_estatus.getSelectedIndex() + 1;

        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if (validacion == 0) {

            switch (permisos_cmb) {
                case 1:
                    permisos_String = "Administrador";
                    break;
                case 2:
                    permisos_String = "Capturista";
                    break;
                case 3:
                    permisos_String = "tecnico";
                    break;
                default:
                    break;
            }
            if (estatus_cmb == 1) {
                estatus_String = "Activo";
            } else {
                if (estatus_cmb == 2) {
                    estatus_String = "Inactivo";
                }
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select username from usuarios where username = '"
                        + username + "' and not id_usuario = '" + ID + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_username.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();

                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update usuarios set nombre_usuario = ?, email = ?, telefono = ?, "
                            + "username = ?, tipo_nivel = ?, estatus = ? where id_usuario = '" + ID + "'");
                    pst2.setString(1, nombre);
                    pst2.setString(2, mail);
                    pst2.setString(3, telefono);
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_String);
                    pst2.setString(6, estatus_String);

                    pst2.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta.");
                }
            } catch (HeadlessException | SQLException e) {
                System.err.println("Error al actualizar" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void cmb_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_estatusActionPerformed
    }//GEN-LAST:event_cmb_estatusActionPerformed

    private void jButton_RestaurarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarPasswordActionPerformed

        RestaurarPassword restaurarPassword = new RestaurarPassword();
        restaurarPassword.setVisible(true);
                
        
    }//GEN-LAST:event_jButton_RestaurarPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_RestaurarPassword;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_nombre2;
    private javax.swing.JLabel jLabel_nombre3;
    private javax.swing.JLabel jLabel_nombre4;
    private javax.swing.JLabel jLabel_nombre5;
    private javax.swing.JLabel jLabel_nombre6;
    private javax.swing.JTextField txt_Registrodopor;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}