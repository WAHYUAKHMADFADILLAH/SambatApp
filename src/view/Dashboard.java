    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public Dashboard() {
        // Set the theme to dark
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(45, 45, 45)); // Dark gray background

        // Create the title label
        titleLabel = new JLabel("Kasir Dashboard");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(255, 255, 255)); // White text
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.setBackground(new Color(45, 45, 45)); // Dark gray background

        // Create the buttons
        button1 = new JButton("Transaksi");
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        button1.setForeground(new Color(255, 255, 255)); // White text
        button1.setBackground(new Color(60, 60, 60)); // Dark gray background
        buttonPanel.add(button1);

        button2 = new JButton("Laporan");
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        button2.setForeground(new Color(255, 255, 255)); // White text
        button2.setBackground(new Color(60, 60, 60)); // Dark gray background
        buttonPanel.add(button2);

        button3 = new JButton("Pengaturan");
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        button3.setForeground(new Color(255, 255, 255)); // White text
        button3.setBackground(new Color(60, 60, 60)); // Dark gray background
        buttonPanel.add(button3);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Set the frame properties
        setTitle("Kasir Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Dashboard();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
