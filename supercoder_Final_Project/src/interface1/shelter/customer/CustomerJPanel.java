/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.shelter.customer;

import interface1.shelter.admin.*;

/**
 *
 * @author 15142087777的AW
 */
public class CustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShelterMainJPanel
     */
    public CustomerJPanel() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Shelter Customer Log in");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 69, -1, -1));

        jLabel2.setText("User_ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 139, -1, -1));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 196, -1, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 136, 333, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 193, 333, -1));

        jButton1.setText("Log in");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jButton2.setText("Back");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
