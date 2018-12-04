/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Communal_PurchaseRequest;

import Business.Communal_Customer.*;
import Business.Communal_Pet.PetDirectory;

/**
 *
 * @author 15142087777的AW
 */
public class PurchaseRequest {
    private String supplyName;
    private int supplyQuantity;
    private int purchaseRequestId;
    private static int count = 1;

    public PurchaseRequest() {
        purchaseRequestId = count;
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

    public int getPurchaseRequestId() {
        return purchaseRequestId;
    }

    public void setPurchaseRequestId(int purchaseRequestId) {
        this.purchaseRequestId = purchaseRequestId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PurchaseRequest.count = count;
    }

    
    @Override
    public String toString() {
        return supplyName.concat("*" + Integer.toString(supplyQuantity));
    }
    
    
}
