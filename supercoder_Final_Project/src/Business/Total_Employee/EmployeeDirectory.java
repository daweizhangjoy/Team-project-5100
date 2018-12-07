/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Total_Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
//    public Employee createEmployee(String name){
//        Employee employee = new Employee();
//        employee.setName(name);
//        employeeList.add(employee);
//        return employee;
//    }
    
    public Employee createEmployeeAdmin(String name, int networkID, int enterpriseID,
                                            String networkName, String enterpriseName,String organizationName)
    {
        Employee employee = new Employee(name, networkID, networkName, enterpriseID, enterpriseName, organizationName);
        
        employeeList.add(employee);
        return employee;
    }
    
    public Employee createEmployee(String name, int networkID, int enterpriseID, int organizationID,
                                            String networkName, String enterpriseName,String organizationName)
    {
        Employee employee = new Employee(name, networkID, networkName, enterpriseID, enterpriseName, organizationName);
        employee.setOrganizationID(organizationID);
        
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }
    
    public Employee searchEmployee(int id)
    {
        for(Employee employee : this.employeeList){
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }
}