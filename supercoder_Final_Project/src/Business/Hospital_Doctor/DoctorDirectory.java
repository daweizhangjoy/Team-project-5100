/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital_Doctor;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> employeeList;

    public DoctorDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Doctor> getEmployeeList() {
        return employeeList;
    }
    
    public Doctor createEmployee(String name){
        Doctor employee = new Doctor();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}