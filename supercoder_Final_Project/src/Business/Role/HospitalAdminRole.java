/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Overall_UserAccount.UserAccount;
import interface1.hospital.hospitalAdmin.HospitalAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminJPanel(userProcessContainer, account, organization, business);
    }
}
