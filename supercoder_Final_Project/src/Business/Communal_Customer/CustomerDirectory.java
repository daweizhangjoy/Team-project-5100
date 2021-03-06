/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Customer;

import Business.Total_Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer)
    {
        customerList.remove(customer);
    }
    
    public Customer searchCustomer(int custoemrId)
    {
        for(Customer customer : this.customerList){
            if(customer.getId()==custoemrId){
                return customer;
            }
        }
        return null;
    }
}
