/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author 15142087777的AW
 */
public class ShelterPetKeepOrganization extends Organization{

    public ShelterPetKeepOrganization() {
        super(Organization.Type.ShelterPetKeep.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
    
}
