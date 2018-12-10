/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.supply.supplyIncomeRole;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyIncomeJPanel extends keeptoo.KGradientPanel 
{

    private KGradientPanel userProcessContainer;
    private Network network;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;

    public SupplyIncomeJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.business = business;
        
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        completeButton = new javax.swing.JButton();
        completeButton1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage the Supply");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 260, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        completeButton.setText("Manage supply");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(completeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 220, 50));

        completeButton1.setText("Complete the request");
        completeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(completeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 220, 50));

        add(kGradientPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void completeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButton1ActionPerformed
        // TODO add your handling code here:
        CompleteRequestJPanel completeRequestJPanel = new CompleteRequestJPanel(userProcessContainer, account, organization, enterprise, network, business);
        userProcessContainer.add("completeRequestJPanel", completeRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_completeButton1ActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // TODO add your handling code here:
        ManageJPanel manageJPanel = new ManageJPanel(userProcessContainer, account, organization, enterprise, network, business);
        userProcessContainer.add("manageJPanel", manageJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_completeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeButton;
    private javax.swing.JButton completeButton1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
