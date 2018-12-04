/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Pet;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class PetDirectory {
    private ArrayList<Employee> employeeList;

    public PetDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}
