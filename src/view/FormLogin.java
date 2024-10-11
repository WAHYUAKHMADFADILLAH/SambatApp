
package view;


import config.Koneksi;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    int xx, xy;
    private Connection conn;
    
    
    
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        
        setBackground(new Color(0,0,0,0));
        setActionButton();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        X = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sign_to_sambat = new javax.swing.JLabel();
        cofee_logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        eye = new javax.swing.JLabel();
        hideeye = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        t_password = new javax.swing.JPasswordField();
        btn_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        X.setBackground(new java.awt.Color(18, 18, 18));
        X.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(18, 18, 18));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_to_sambat.setFont(new java.awt.Font("JetBrainsMono NF ExtraBold", 1, 20)); // NOI18N
        sign_to_sambat.setForeground(new java.awt.Color(255, 255, 255));
        sign_to_sambat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_to_sambat.setText("Sign in to Sambat");
        jPanel2.add(sign_to_sambat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 312, 35));

        cofee_logo.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        cofee_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cofee_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-cafe-24.png"))); // NOI18N
        cofee_logo.setMaximumSize(new java.awt.Dimension(50, 50));
        jPanel2.add(cofee_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 43, 43), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-view-20.png"))); // NOI18N
        jPanel3.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 30, 30));

        hideeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-view-20.png"))); // NOI18N
        jPanel3.add(hideeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 30, 30));

        t_username.setBackground(new java.awt.Color(18, 18, 18));
        t_username.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        t_username.setForeground(new java.awt.Color(255, 255, 255));
        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 43, 43), 1, true));
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 258, 28));

        username.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        password.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btn_login.setBackground(new java.awt.Color(76, 175, 80));
        btn_login.setFont(new java.awt.Font("JetBrainsMono NF ExtraBold", 0, 13)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Sign in");
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 43, 43)));
        jPanel3.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 30));

        t_password.setBackground(new java.awt.Color(18, 18, 18));
        t_password.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        t_password.setForeground(new java.awt.Color(255, 255, 255));
        t_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 43, 43), 1, true));
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 258, 28));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 210));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 214, 90, 0);
        X.add(jPanel2, gridBagConstraints);

        btn_close.setFont(new java.awt.Font("JetBrainsMono NF", 3, 13)); // NOI18N
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-cancel-24.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 185, 0, 6);
        X.add(btn_close, gridBagConstraints);

        getContentPane().add(X, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked

    }//GEN-LAST:event_btn_closeMouseClicked

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel X;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel cofee_logo;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hideeye;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel password;
    private javax.swing.JLabel sign_to_sambat;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        eye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(false);
                hideeye.setVisible(true);
                t_password.setEchoChar((char)0);
            }
            
        });
        
        hideeye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(true);
                hideeye.setVisible(false);
                t_password.setEchoChar('*');
            }
            
        });
        
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesLogin();
            }
        });

        btn_close.addMouseListener(new MouseAdapter(){

            @Override

            public void mouseClicked(MouseEvent e ) {

                int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {

                    dispose();

                    System.exit(0);

                }

            }
            

        });

        
        t_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btn_login.doClick();
                }
            }
        });

        t_password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btn_login.doClick();
                }
            }
        });
    }
    
    private String getMd5java(String message) {
    String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for(byte b : hash){
                sb.append(String.format("%02x",b & 0xff));
                
            }
            digest = sb.toString();
            
        } catch (Exception e) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE,null,e);
        }
        return digest;
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Username tidak boleh kosong");
        }else if(t_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;        
    }
    
    private boolean  checkLogin(String username, String password){
        if(conn != null){
            try {
                String sql = "SELECT * FROM user WHERE Username = ? AND Password = ?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);
                
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }
    
    private void prosesLogin(){
        if(validasiInput()){
            String username = t_username.getText();
            String password = new String(t_password.getPassword());
            String hashedPassword = getMd5java(password);
            
            if(checkLogin(username, hashedPassword)){
                AdminPage mn = new AdminPage();
                mn.setVisible(true);
                mn.revalidate();
                
                dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Username dan Password Salah",
                        "Pesan",JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }
}
