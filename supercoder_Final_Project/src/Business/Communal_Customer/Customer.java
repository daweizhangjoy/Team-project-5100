/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Customer;

import Business.Communal_Pet.PetDirectory;

/**
 *
 * @author 15142087777的AW
 */
public class Customer {
    private String name;
    private int id;
    private static int count = 1;
    private PetDirectory petDirectory;

    public Customer() {
        id = count;
        count++;
        petDirectory = new PetDirectory();
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }
    
    
}
