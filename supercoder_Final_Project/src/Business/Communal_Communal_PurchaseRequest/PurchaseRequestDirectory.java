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
    
    public PurchaseRequest createPurchaseRequest(int supplyId, String supplyName,int supplyQuantity,int enterpriseId){
        PurchaseRequest purchaseRequest = new PurchaseRequest();
        
        purchaseRequest.setSupplyId(supplyId);
        purchaseRequest.setSupplyName(supplyName);
        purchaseRequest.setSupplyQuantity(supplyQuantity);
        purchaseRequest.setEnterpriseNum(enterpriseId);
        
        purchaseRequestsList.add(purchaseRequest);
        
        return purchaseRequest;
    }
    
    public void deletePurchaseRequest(PurchaseRequest purchaseRequest)
    {
        purchaseRequestsList.remove(purchaseRequest);
    }
    
    public PurchaseRequest searchPurchaseRequest(int purchaseRequestId)
    {
        for(PurchaseRequest purchaseRequest : this.purchaseRequestsList){
            if(purchaseRequest.getPurchaseRequestId() == purchaseRequestId){
                return purchaseRequest;
            }
        }
        return null;
    }
}
