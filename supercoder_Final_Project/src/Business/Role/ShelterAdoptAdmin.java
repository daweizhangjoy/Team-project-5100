/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Total_UserAccount.UserAccount;
import interface1.hospital.supplyManageRole.HospitalSupplyManageJPanel;
import interface1.shelter.adoptRole.ShelterAdoptJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 15142087777的AW
 */
public class ShelterAdoptAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShelterAdoptJPanel(userProcessContainer, account, organization, business);
    }
    
    
}
