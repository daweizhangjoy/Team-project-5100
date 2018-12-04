/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Role.Role;
import Business.Role.ShelterAdminRole;
import java.util.ArrayList;
/**
 *
 * @author 15142087777的AW
 */
public class ShelterAdminOrganization extends ShelterOrganization{

    public ShelterAdminOrganization() {
        super(Type.ShelterAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterAdminRole());
        return roles;
    }
    
}
