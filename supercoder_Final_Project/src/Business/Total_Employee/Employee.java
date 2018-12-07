/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Total_Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    
    private int networkID;
    private String networkName;
    private int enterpriseID;
    private String enterpriseName;
    private int organizationID;
    private String organizationName;
    


    public Employee(String name, int networkID, String networkName, int enterpriseID, String enterpriseName, String organizationName) 
    {
        this.name = name;
        this.networkID = networkID;
        this.enterpriseID = enterpriseID;
        this.networkName = networkName;
        this.enterpriseName = enterpriseName;
        this.organizationName = organizationName;
        
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    
}
