/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital_TotalSupply;

import Business.Shelter_TotalSupply.*;
import Business.Communal_TotalSupply.*;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */

public class TotalSupplyDirectory {
    private ArrayList<TotalSupply> totalSupplyList;

    public TotalSupplyDirectory() {
        totalSupplyList = new ArrayList();
    }

    public ArrayList<TotalSupply> getTotalSupplyList() {
        return totalSupplyList;
    }

    public void setTotalSupplyList(ArrayList<TotalSupply> totalSupplyList) {
        this.totalSupplyList = totalSupplyList;
    }

    
    public TotalSupply createCustomer(String supplyName, int supplyQuantity){
        TotalSupply totalSupply = new TotalSupply();
        
        totalSupply.setSupplyName(supplyName);
        totalSupply.setSupplyQuantity(supplyQuantity);
        
        totalSupplyList.add(totalSupply);
        
        return totalSupply;
    }
}
