/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Communal_PurchaseRequest;

import Business.Communal_Customer.*;
import java.util.ArrayList;

/**
 *
 * @author 15142087777的AW
 */
public class PurchaseRequestDirectory {
    
    private ArrayList<PurchaseRequest> purchaseRequestsList;

    public PurchaseRequestDirectory() {
        purchaseRequestsList = new ArrayList();
    }

    public ArrayList<PurchaseRequest> getPurchaseRequestsList() {
        return purchaseRequestsList;
    }

    public void setPurchaseRequestsList(ArrayList<PurchaseRequest> purchaseRequestsList) {
        this.purchaseRequestsList = purchaseRequestsList;
    }
    
    public PurchaseRequest createPurchaseRequest(String supplyName, int supplyQuantity){
        PurchaseRequest purchaseRequest = new PurchaseRequest();
        
        purchaseRequest.setSupplyName(supplyName);
        purchaseRequest.setSupplyQuantity(supplyQuantity);
        
        purchaseRequestsList.add(purchaseRequest);
        
        return purchaseRequest;
    }
}
