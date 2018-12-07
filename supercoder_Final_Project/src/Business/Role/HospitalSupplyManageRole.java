/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import interface1.hospital.supplyManageRole.HospitalSupplyManageJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalSupplyManageRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network,EcoSystem business) {
        return new HospitalSupplyManageJPanel(userProcessContainer, account, organization, (HospitalEnterprise)enterprise, network, business);
    }
}
