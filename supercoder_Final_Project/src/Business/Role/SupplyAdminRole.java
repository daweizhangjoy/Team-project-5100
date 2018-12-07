/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import interface1.hospital.hRAdminRole.HospitalHRAdminJPanel;
import interface1.supply.supplyAdminRole.SupplyAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplyAdminJPanel(userProcessContainer, enterprise);
    }
}
