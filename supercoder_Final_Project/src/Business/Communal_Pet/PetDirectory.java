/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Pet;

import Business.Overall_Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class PetDirectory {
    private ArrayList<Pet> petList;

    public PetDirectory() {
        petList = new ArrayList();
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }
    
    public Pet createPet(String petName){
        Pet pet = new Pet();
        
        pet.setPetName(petName);
        
        petList.add(pet);
        
        return pet;
    }
}
