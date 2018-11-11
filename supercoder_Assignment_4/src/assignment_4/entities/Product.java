/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Product {
    private int product_Id;
    private int target_Price;
    
    public Product(int product_Id, int target_Price) {
        this.product_Id = product_Id;
        this.target_Price = target_Price;
    }

    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public int getTarget_Price() {
        return target_Price;
    }

    public void setTarget_Price(int target_Price) {
        this.target_Price = target_Price;
    }
    
    
}
