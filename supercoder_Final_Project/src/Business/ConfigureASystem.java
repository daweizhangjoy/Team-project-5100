package Business;

import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Total_Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.Total_UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole(), 0,  0,"", "", "", Enterprise.EnterpriseType.SystemAdmin);
        
        return system;
    }
    
}
