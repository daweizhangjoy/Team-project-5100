/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Role.Role;
import Business.Role.ShelterSupplyManageRole;
import java.util.ArrayList;
/**
 *
 * @author 15142087777的AW
 */
public class ShelterSupplyManageOrganization extends ShelterOrganization{

    public ShelterSupplyManageOrganization() {
        super(Type.ShelterSupplyManage.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterSupplyManageRole());
        return roles;
    }
    
}
