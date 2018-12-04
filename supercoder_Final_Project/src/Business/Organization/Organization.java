/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Communal_Communal_PurchaseRequest.PurchaseRequestDirectory;
import Business.Communal_Customer.CustomerDirectory;
import Business.Communal_Pet.PetDirectory;
import Business.Communal_PetCase.PetCaseDirectory;
import Business.Communal_TotalSupply.TotalSupplyDirectory;
import Business.Communal_Employee.EmployeeDirectory;
import Business.Communal_UserAccount.UserAccountDirectory;
import Business.Role.Role;

//import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;

    private CustomerDirectory customerDirectory;
    private PurchaseRequestDirectory purchaseRequestDirectory;
    private PetDirectory petDirectory;
    private PetCaseDirectory petCaseDirectory;
    private TotalSupplyDirectory totalSupplyDirectory;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalHRAdmin("HRAdmin Organization"), HospitalAdmin("HospitalAdmin Organization"), HospitalPatient("HospitalPatient Organization"), HospitalSupplyManage("HospitalSupplyManage Organization"), 
        ShelterAdopt("ShelterAdopt Organization"), ShelterAdmin("ShelterAdmin Organization"), ShelterPetKeep("ShelterPetKeep Organization"), ShelterSupplyManage("ShelterSupplyManage Organization"), 
        SupplyIncome("SupplyIncome Organization"), SupplyOutcome("SupplyOutcome Organization"), SupplyAdmin("SupplyAdmin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;

        customerDirectory = new CustomerDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
        petDirectory = new PetDirectory();
        petCaseDirectory = new PetCaseDirectory();
        totalSupplyDirectory = new TotalSupplyDirectory();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }

    public PetCaseDirectory getPetCaseDirectory() {
        return petCaseDirectory;
    }

    public void setPetCaseDirectory(PetCaseDirectory petCaseDirectory) {
        this.petCaseDirectory = petCaseDirectory;
    }

    public TotalSupplyDirectory getTotalSupplyDirectory() {
        return totalSupplyDirectory;
    }

    public void setTotalSupplyDirectory(TotalSupplyDirectory totalSupplyDirectory) {
        this.totalSupplyDirectory = totalSupplyDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
