/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.ShelterAdoptAdmin;
import Business.Role.ShelterPetKeeper;
import java.util.ArrayList;
/**
 *
 * @author 15142087777的AW
 */
public class ShelterAdoptOrganization extends Organization{

    public ShelterAdoptOrganization() {
        super(Organization.Type.ShelterAdopt.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterAdoptAdmin());
        return roles;
    }
     
    
    
}