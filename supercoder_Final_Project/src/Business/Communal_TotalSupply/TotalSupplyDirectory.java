/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_TotalSupply;

import Business.Communal_Customer.*;
import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class TotalSupplyDirectory {
    private ArrayList<TotalSupply> customerList;

    public TotalSupplyDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<TotalSupply> getCustomerList() {
        return customerList;
    }
    
    public TotalSupply createCustomer(String name){
        TotalSupply customer = new TotalSupply();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
}
