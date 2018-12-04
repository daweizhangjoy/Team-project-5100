/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.*;
import Business.Role.Role;
import Business.Shelter_Employee.EmployeeDirectory;
import Business.Shelter_TotalSupply.TotalSupplyDirectory;
import Business.Shelter_UserAccount.UserAccountDirectory;
//import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class ShelterOrganization extends Organization{
    
    private EmployeeDirectory shelterEmployeeDirectory;
    private TotalSupplyDirectory shelterTotalSupplyDirectory;
    private UserAccountDirectory shelterUserAccountDirectory;
    
    
    public ShelterOrganization(String name) {
        super(name);
        shelterEmployeeDirectory = new EmployeeDirectory();
        shelterTotalSupplyDirectory = new TotalSupplyDirectory();
        shelterUserAccountDirectory = new UserAccountDirectory();
    }

    public EmployeeDirectory getShelterEmployeeDirectory() {
        return shelterEmployeeDirectory;
    }

    public void setShelterEmployeeDirectory(EmployeeDirectory shelterEmployeeDirectory) {
        this.shelterEmployeeDirectory = shelterEmployeeDirectory;
    }

    public TotalSupplyDirectory getShelterTotalSupplyDirectory() {
        return shelterTotalSupplyDirectory;
    }

    public void setShelterTotalSupplyDirectory(TotalSupplyDirectory shelterTotalSupplyDirectory) {
        this.shelterTotalSupplyDirectory = shelterTotalSupplyDirectory;
    }

    public UserAccountDirectory getShelterUserAccountDirectory() {
        return shelterUserAccountDirectory;
    }

    public void setShelterUserAccountDirectory(UserAccountDirectory shelterUserAccountDirectory) {
        this.shelterUserAccountDirectory = shelterUserAccountDirectory;
    }
}
