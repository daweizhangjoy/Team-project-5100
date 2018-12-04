/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Pet;

/**
 *
 * @author 15142087777的AW
 */
public class Pet {
    private String petName;
    private int id;
    private static int count = 1;

    public Pet() {
        id = count;
        count++;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pet.count = count;
    }

    
    
    @Override
    public String toString() {
        return petName ;
    }
    
    
}
