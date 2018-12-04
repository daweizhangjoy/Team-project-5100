/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Supply;

import Business.Organization.*;
import Business.Supply_Employee.EmployeeDirectory;
import Business.Supply_UserAccount.UserAccountDirectory;


/**
 *
 * @author raunak
 */
public abstract class SupplyOrganization extends Organization{
    
    private EmployeeDirectory supplyEmployeeDirectory;
    private UserAccountDirectory supplyUserAccountDirectory;

    public SupplyOrganization(String name) {
        super(name);
        supplyEmployeeDirectory = new EmployeeDirectory();
        supplyUserAccountDirectory = new UserAccountDirectory();
    }

    public EmployeeDirectory getSupplyEmployeeDirectory() {
        return supplyEmployeeDirectory;
    }

    public void setSupplyEmployeeDirectory(EmployeeDirectory supplyEmployeeDirectory) {
        this.supplyEmployeeDirectory = supplyEmployeeDirectory;
    }

    public UserAccountDirectory getSupplyUserAccountDirectory() {
        return supplyUserAccountDirectory;
    }

    public void setSupplyUserAccountDirectory(UserAccountDirectory supplyUserAccountDirectory) {
        this.supplyUserAccountDirectory = supplyUserAccountDirectory;
    }
}
