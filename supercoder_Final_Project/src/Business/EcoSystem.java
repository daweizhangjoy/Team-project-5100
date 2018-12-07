/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Total_UserAccount.UserAccountDirectory;
import Business.Total_Employee.EmployeeDirectory;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    
    private EcoSystem(){
        super(null);
        networkDirectory=new NetworkDirectory();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(String name){
        Network network = networkDirectory.createNetwork(name);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkList) {
        this.networkDirectory = networkList;
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
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
//        for(Network network:networkList){
//            
//        }
        return true;
    }
}
