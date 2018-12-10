/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.supply.supplyDataAnalyseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.ImageIcon;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class PictureJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PictureJPanel
     */
    private KGradientPanel userProcessContainer;
    private Network network;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;

    PictureJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.business = business;
        
        System.out.println("./aa.png");
        ImageIcon icon = new ImageIcon("./aa.png");
        icon.setImage(icon.getImage().getScaledInstance(600, 600, SCALE_DEFAULT));
        viewPicturejLabel.setIcon(icon);
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
        viewPicturejLabel = new javax.swing.JLabel();
        backJButton2 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(viewPicturejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 600, 600));

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add(kGradientPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel viewPicturejLabel;
    // End of variables declaration//GEN-END:variables
}
