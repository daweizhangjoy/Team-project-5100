/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Total_UserAccount;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Total_Employee.Employee;
import Business.Role.Role;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private int networkID;
    private String networkName;
    private int enterpriseID;
    private String enterpriseName;
    private int organizationID;
    private String organizationName;
    private EnterpriseType enterpriseType;

    public UserAccount(int networkID, String networkName, int enterpriseID, String enterpriseName, String organizationName, EnterpriseType enterpriseType) {
        this.networkID = networkID;
        this.enterpriseID = enterpriseID;
        this.networkName = networkName;
        this.enterpriseName = enterpriseName;
        this.organizationName = organizationName;
        this.enterpriseType = enterpriseType;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}