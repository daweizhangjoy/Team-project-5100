/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_PetCase;

import Business.Communal_Customer.*;
import Business.Overall_Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 15142087777的AW
 */
public class PetCaseDirectory {
    private ArrayList<PetCase> petCaseList;

    public PetCaseDirectory() {
        petCaseList = new ArrayList();
    }

    public ArrayList<PetCase> getPetCaseList() {
        return petCaseList;
    }

    public void setPetCaseList(ArrayList<PetCase> petCaseList) {
        this.petCaseList = petCaseList;
    }
    
    public PetCase createPetCase(String deseaseName, Date caseDate)
    {
        PetCase petCase = new PetCase();
        
        petCase.setDeseaseName(deseaseName);
        petCase.setCaseDate(caseDate);
        
        petCaseList.add(petCase);
        
        return petCase;
    }
}
