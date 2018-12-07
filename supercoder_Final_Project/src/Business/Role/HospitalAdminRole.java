/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import interface1.hospital.adminRole.HospitalAdminJPanel;

import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new HospitalAdminJPanel(userProcessContainer, enterprise, network, business);
    }
}
