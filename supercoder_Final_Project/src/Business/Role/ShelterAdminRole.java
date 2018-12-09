/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Total_UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import interface1.hospital.hRAdminRole.HospitalHRAdminJPanel;
import interface1.shelter.adminRole.ShelterAdminJPanel;
import keeptoo.KGradientPanel;

/**
 *
 * @author 15142087777的AW
 */
public class ShelterAdminRole extends Role{
    @Override
    public KGradientPanel createWorkArea(KGradientPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ShelterAdminJPanel(userProcessContainer, enterprise, network, business);
    }
}
