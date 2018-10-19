/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User implements Comparable<Customer>{
    /*private String name;
    private String role;
    private String customerusername;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCustomerusername() {
        return customerusername;
    }

    public void setCustomerusername(String customerusername) {
        this.customerusername = customerusername;
    }*//*delete by Hongbo Jiang*/
    private CustomerDirectory customerDirectory;
    
    private String dateNowStr;
    
    public Customer(String password, String userName) 
    {
        super(password, userName, "CUSTOMER");
        
        Date d = new Date();  
        System.out.println(d);  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        this.dateNowStr = sdf.format(d);   
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public String getDateNowStr() {
        return dateNowStr;
    }

    public void setDateNowStr(String dateNowStr) {
        this.dateNowStr = dateNowStr;
    } 

    @Override
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
