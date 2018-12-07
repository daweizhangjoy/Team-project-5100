/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Shelter_TotalSupply.TotalSupplyDirectory;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class ShelterEnterprise extends Enterprise {
    
    private TotalSupplyDirectory shelterTotalSupplyDirectory; 
    
    public ShelterEnterprise(String name){
        super(name,EnterpriseType.Shelter);
        shelterTotalSupplyDirectory = new TotalSupplyDirectory();
    }

    public TotalSupplyDirectory getShelterTotalSupplyDirectory() {
        return shelterTotalSupplyDirectory;
    }

    public void setShelterTotalSupplyDirectory(TotalSupplyDirectory shelterTotalSupplyDirectory) {
        this.shelterTotalSupplyDirectory = shelterTotalSupplyDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
