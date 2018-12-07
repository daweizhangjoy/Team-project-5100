/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Shelter;

import Business.Organization.*;
import Business.Role.Role;
import Business.Shelter_TotalSupply.TotalSupplyDirectory;
//import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class ShelterOrganization extends Organization{
    
//    private TotalSupplyDirectory shelterTotalSupplyDirectory;    
    
    public ShelterOrganization(String name) {
        super(name);
//        shelterTotalSupplyDirectory = new TotalSupplyDirectory();
    }

//    public TotalSupplyDirectory getShelterTotalSupplyDirectory() {
//        return shelterTotalSupplyDirectory;
//    }
//
//    public void setShelterTotalSupplyDirectory(TotalSupplyDirectory shelterTotalSupplyDirectory) {
//        this.shelterTotalSupplyDirectory = shelterTotalSupplyDirectory;
//    }
}
