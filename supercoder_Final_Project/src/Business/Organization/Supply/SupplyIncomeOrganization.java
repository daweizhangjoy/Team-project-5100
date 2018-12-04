/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Supply;

import Business.Role.Role;
import Business.Role.SupplyIncomeRole;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class SupplyIncomeOrganization extends SupplyOrganization{

    public SupplyIncomeOrganization() {
        super(Type.SupplyIncome.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplyIncomeRole());
        return roles;
    }
    
}
