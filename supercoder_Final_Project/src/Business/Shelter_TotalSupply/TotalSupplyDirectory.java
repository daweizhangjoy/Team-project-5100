/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter_TotalSupply;

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
    
    public void deleteTotalSupply(TotalSupply totalSupply)
    {
        totalSupplyList.remove(totalSupply);
    }
    
    public TotalSupply searchTotalSupply(int supplyId)
    {
        for(TotalSupply totalSupply : this.totalSupplyList){
            if(totalSupply.getSupplyId()==supplyId){
                return totalSupply;
            }
        }
        return null;
    }
}
