/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Role.HospitalSupplyManageRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class HospitalSupplyManageOrganization extends HospitalOrganization{

    public HospitalSupplyManageOrganization() {
        super(Type.HospitalSupplyManage.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalSupplyManageRole());
        return roles;
    }
    
}
