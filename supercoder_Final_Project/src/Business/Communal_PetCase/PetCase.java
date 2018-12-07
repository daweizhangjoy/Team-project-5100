/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_PetCase;

import Business.Communal_Customer.*;
import Business.Communal_Pet.PetDirectory;
import java.util.Date;

/**
 *
 * @author 15142087777的AW
 */
public class PetCase {
    private String deseaseName;
    private int caseId;
    private Date caseDate;
    private int petId;
    private static int count = 1;

    public PetCase() {
        caseId = count;
        count++;
        caseDate = new Date();
    }

    public String getDeseaseName() {
        return deseaseName;
    }

    public void setDeseaseName(String deseaseName) {
        this.deseaseName = deseaseName;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public Date getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(Date caseDate) {
        this.caseDate = caseDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PetCase.count = count;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
    
    @Override
    public String toString() {
        return String.valueOf(petId);
    }
}
