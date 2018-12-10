/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Supply;

import Business.Role.Role;
import Business.Role.SupplyOutcomeRole;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyDataAnalsisOrganization extends SupplyOrganization{

    public SupplyDataAnalsisOrganization() {
        super(Type.SupplyDataAnalysis.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplyOutcomeRole());
        return roles;
    }
    
}
