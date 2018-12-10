/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1.hospital.supplyManageRole;

import Business.Communal_Communal_PurchaseRequest.PurchaseRequest;
import Business.Communal_TotalSupply.TotalSupply;
import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class AddSupplyJPanel extends keeptoo.KGradientPanel {

    /**
     * Creates new form AddSupplyJPanel
     */
    KGradientPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    HospitalEnterprise hospitalEnterprise;
    Network network;
    EcoSystem business;
    
    AddSupplyJPanel(KGradientPanel userProcessContainer, UserAccount account, Organization organization, HospitalEnterprise hospitalEnterprise, Network network, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.hospitalEnterprise = hospitalEnterprise;
        this.network = network;
        this.business = business;
        
        populateTable();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchByIdQuantityTextField = new javax.swing.JTextField();
        searchByIdTextField = new javax.swing.JTextField();
        addbyIdButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addByNameQuantityTextField = new javax.swing.JTextField();
        addbyNameButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        communalSupplyTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Supply to Hospital Repository");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 460, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        kGradientPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        kGradientPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 130, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("SupplyId");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("SupplyQuantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        searchByIdQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdQuantityTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchByIdQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, -1));
        jPanel1.add(searchByIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, -1));

        addbyIdButton.setText("Make Request");
        addbyIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbyIdButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addbyIdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 160, -1));

        jTabbedPane1.addTab("Add by SupplyId", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("SupplyQuantity");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));
        jPanel2.add(addByNameQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, -1));

        addbyNameButton.setText("Make Request");
        addbyNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbyNameButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addbyNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 120, -1));

        communalSupplyTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SupplyId", "SupplyQuantity", "SupplyName"
            }
        ));
        jScrollPane1.setViewportView(communalSupplyTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 490, 180));

        jTabbedPane1.addTab("Add by SupplyName", jPanel2);

        kGradientPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 580, 350));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        add(kGradientPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void addbyIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbyIdButtonActionPerformed
        // TODO add your handling code here:
        if((searchByIdTextField.getText().equals("") || searchByIdQuantityTextField.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Please write in the right information!!");
        }
        else
        {
            int find = 0;
            
            try
            {
                int searchById = Integer.parseInt(searchByIdTextField.getText());
                int quantity = Integer.parseInt(searchByIdQuantityTextField.getText());
                
                for(TotalSupply communalTotalSupply : network.getTotalSupplyDirectory().getTotalSupplyList())
                {
                    if(communalTotalSupply.getCategory().toString().equals("Medicine"))
                    {
                        if(searchById == communalTotalSupply.getSupplyId())/*supplyid registed*/
                        {
                            /*make request*/
                            PurchaseRequest purchaseRequest = network.getPurchaseRequestDirectory().createPurchaseRequest(searchById, communalTotalSupply.getSupplyName(),quantity,hospitalEnterprise.getEnterpriseID());
                            
                            if(quantity <=  communalTotalSupply.getSupplyQuantity())
                            {
                                int quantityFormer = communalTotalSupply.getSupplyQuantity();
                                communalTotalSupply.setSupplyQuantity(quantityFormer - quantity);
                                
                                if(hospitalEnterprise.getHospitalTotalSupplyDirectory().searchTotalSupply(searchById) == null)
                                {
                                    Business.Hospital_TotalSupply.TotalSupply newTotalSupply = 
                                        hospitalEnterprise.getHospitalTotalSupplyDirectory().createTotalSupply(searchById, communalTotalSupply.getSupplyName(),quantity);
                                    find = 1;
                                }
                                else
                                {
                                    Business.Hospital_TotalSupply.TotalSupply hospitalTotalSupply
                                            = hospitalEnterprise.getHospitalTotalSupplyDirectory().searchTotalSupply(searchById);
                                    hospitalTotalSupply.setSupplyQuantity(hospitalTotalSupply.getSupplyQuantity() + quantity);
                                    find = 2;
                                }
                                
                                purchaseRequest.setRequestCompeledFlag(true);
                                
                            }
                            else
                            {
                                find = 3;
                            }
                        }
                    }
                }
                
                switch(find)
                {
                    case 0:
                    {
                        JOptionPane.showMessageDialog(null, "Supply not exist");
                        break;
                    }
                    case 1:
                    {
                        JOptionPane.showMessageDialog(null, "New Supply added and Supply has been transfered");
                        break;
                    }
                    case 2:
                    {
                        JOptionPane.showMessageDialog(null, "Supply has been added to former rep");
                        break;
                    }
                    case 3:
                    {
                        JOptionPane.showMessageDialog(null, "Supply not enough, needing to be completed");
                        break;
                    }
                }
                
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);        
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Please write in the right information!!");
            }
        }
    }//GEN-LAST:event_addbyIdButtonActionPerformed

    private void searchByIdQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIdQuantityTextFieldActionPerformed

    private void addbyNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbyNameButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = communalSupplyTable1.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            populateTable();
        }
        else
        {
            Business.Communal_TotalSupply.TotalSupply supply = (Business.Communal_TotalSupply.TotalSupply)communalSupplyTable1.getValueAt(selectedRow, 0);
            
            try 
            {
                int quantity = Integer.parseInt(addByNameQuantityTextField.getText());
                PurchaseRequest purchaseRequest = network.getPurchaseRequestDirectory().createPurchaseRequest(supply.getSupplyId(), supply.getSupplyName(),quantity, hospitalEnterprise.getEnterpriseID());
                            
                int find = 2;
                if(quantity <=  supply.getSupplyQuantity())
                {
                    int quantityFormer = supply.getSupplyQuantity();
                    supply.setSupplyQuantity(quantityFormer - quantity);
                                
                    purchaseRequest.setRequestCompeledFlag(true);
                    if(hospitalEnterprise.getHospitalTotalSupplyDirectory().searchTotalSupply(supply.getSupplyId()) == null)
                    {
                        Business.Hospital_TotalSupply.TotalSupply newTotalSupply = 
                                        hospitalEnterprise.getHospitalTotalSupplyDirectory().createTotalSupply(supply.getSupplyId(), supply.getSupplyName(),quantity);
                        find = 1;
                    }
                    else
                    {
                        Business.Hospital_TotalSupply.TotalSupply hospitalTotalSupply
                                 = hospitalEnterprise.getHospitalTotalSupplyDirectory().searchTotalSupply(supply.getSupplyId());
                        hospitalTotalSupply.setSupplyQuantity(hospitalTotalSupply.getSupplyQuantity() + quantity);
                        find = 2;
                    }
                                
                    purchaseRequest.setRequestCompeledFlag(true);
                }
                else
                {
                    find = 3;
                }
                
                switch(find)
                {
                    case 0:
                    {
                        JOptionPane.showMessageDialog(null, "Supply not exist");
                        break;
                    }
                    case 1:
                    {
                        JOptionPane.showMessageDialog(null, "New Supply added and Supply has been transfered");
                        break;
                    }
                    case 2:
                    {
                        JOptionPane.showMessageDialog(null, "Supply has been added to former rep");
                        break;
                    }
                    case 3:
                    {
                        JOptionPane.showMessageDialog(null, "Supply not enough, needing to be completed");
                        break;
                    }
                }
                
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Please write in the right information!!");
            }
        }
    }//GEN-LAST:event_addbyNameButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addByNameQuantityTextField;
    private javax.swing.JButton addbyIdButton;
    private javax.swing.JButton addbyNameButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable communalSupplyTable1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField searchByIdQuantityTextField;
    private javax.swing.JTextField searchByIdTextField;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) communalSupplyTable1.getModel();
        
        model.setRowCount(0);
        
        for (Business.Communal_TotalSupply.TotalSupply communalSupply : network.getTotalSupplyDirectory().getTotalSupplyList())
        {
            if(communalSupply.getCategory().toString().equals("Medicine"))
            {
                Object[] row = new Object[3];
                row[0] = communalSupply;
                row[2] = communalSupply.getSupplyName();
                row[1] = communalSupply.getSupplyQuantity();
            
                model.addRow(row);
            }
        }
    }
}
