
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
        t_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(18, 18, 18));

        sign_to_sambat.setFont(new java.awt.Font("JetBrainsMono NF ExtraBold", 1, 20)); // NOI18N
        sign_to_sambat.setForeground(new java.awt.Color(255, 255, 255));
        sign_to_sambat.setText("Sign in to Sambat");

        cofee_logo.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        cofee_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-cafe-24.png"))); // NOI18N
        cofee_logo.setMaximumSize(new java.awt.Dimension(50, 50));

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 43, 43), 1, true));

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-view-20.png"))); // NOI18N

        hideeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-view-20.png"))); // NOI18N

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

        username.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");

        password.setFont(new java.awt.Font("JetBrainsMono NF", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");

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

        btn_login.setBackground(new java.awt.Color(76, 175, 80));
        btn_login.setFont(new java.awt.Font("JetBrainsMono NF ExtraBold", 0, 13)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Sign in");
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 43, 43)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(username))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(password))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hideeye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(username)
                .addGap(2, 2, 2)
                .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(password)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hideeye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sign_to_sambat)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(cofee_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sign_to_sambat))
                    .addComponent(cofee_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_close.setFont(new java.awt.Font("JetBrainsMono NF", 3, 13)); // NOI18N
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img24/icons8-cancel-24.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout XLayout = new javax.swing.GroupLayout(X);
        X.setLayout(XLayout);
        XLayout.setHorizontalGroup(
            XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
            .addGroup(XLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        XLayout.setVerticalGroup(
            XLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close)
                .addGap(68, 68, 68)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked

    }//GEN-LAST:event_btn_closeMouseClicked

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
        
        btn_login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
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

        
        t_password.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
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
                dash mn = new dash();
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
