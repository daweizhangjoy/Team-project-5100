/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Role.Role;
import Business.Role.ShelterPetKeepRole;
import Business.Role.ShelterPetKeepRole;
import java.util.ArrayList;
/**
 *
 * @author 15142087777的AW
 */
public class ShelterPetKeepOrganization extends ShelterOrganization{

    public ShelterPetKeepOrganization() {
        super(Type.ShelterPetKeep.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterPetKeepRole());
        return roles;
    }
    
}
