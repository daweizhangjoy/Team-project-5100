/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter_TotalSupply;

import Business.Communal_TotalSupply.*;
import Business.Communal_Pet.PetDirectory;

/**
 *
 * @author 15142087777的AW
 */
public class TotalSupply {
    private String supplyName;
    private int supplyQuantity;
    private int supplyId;
    private static int count = 1;

    public TotalSupply() {
        supplyId = count;
        count++;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public int getSupplyQuantity() {
        return supplyQuantity;
    }

    public void setSupplyQuantity(int supplyQuantity) {
        this.supplyQuantity = supplyQuantity;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TotalSupply.count = count;
    }

    @Override
    public String toString() {
        return supplyName.concat("*" + Integer.toString(supplyQuantity));
    }
    
}
