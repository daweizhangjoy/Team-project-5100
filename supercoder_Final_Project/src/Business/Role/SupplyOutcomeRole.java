/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Communal_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import interface1.hospital.hRAdminRole.HospitalHRAdminJPanel;
import interface1.supply.supplyOutComeRole.SupplyOutcomeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyOutcomeRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplyOutcomeJPanel(userProcessContainer, account, organization, business);
    }
}
