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
    private String petPicString;
    private boolean adoptFlag;
    private int id;
    private static int count = 1;

    public Pet() {
        id = count;
        adoptFlag = false;
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

    public String getPetPicString() {
        return petPicString;
    }

    public void setPetPicString(String petPicString) {
        this.petPicString = petPicString;
    }

    public boolean isAdoptFlag() {
        return adoptFlag;
    }

    public void setAdoptFlag(boolean adoptFlag) {
        this.adoptFlag = adoptFlag;
    }
    
    @Override
    public String toString() {
        return String.valueOf(id) ;
    }
    
    
}
