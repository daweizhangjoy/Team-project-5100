/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.*;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
//import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class ShelterOrganization {

    private String name;
    //private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalHRAdmin("HRAdmin Organization"), HospitalMonitor("HospitalMonitor Organization"), HospitalPatient("HospitalPatient Organization"), HospitalSupplyManage("HospitalSupplyManage Organization"), 
        ShelterAdopt("ShelterAdopt Organization"), ShelterMonitor("ShelterMonitor Organization"), ShelterPetKeep("ShelterPetKeep Organization"), ShelterSupplyManage("ShelterSupplyManage Organization"), 
        SupplyIncome("SupplyIncome Organization"), SupplyOutcome("SupplyOutcome Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public ShelterOrganization(String name) {
        this.name = name;
        //workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
