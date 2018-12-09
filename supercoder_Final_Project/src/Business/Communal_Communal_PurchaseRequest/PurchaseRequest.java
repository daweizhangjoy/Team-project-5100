/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_Communal_PurchaseRequest;

import Business.Communal_Customer.*;
import Business.Communal_Pet.PetDirectory;
import java.util.Date;

/**
 *
 * @author 15142087777的AW
 */
public class PurchaseRequest {
    private int supplyId;
    private String supplyName;
    private int supplyQuantity;
    private int purchaseRequestId;
    private boolean requestCompeledFlag;
    private int enterpriseNum;
    private Date date;
    private static int count = 1;

    public PurchaseRequest() {
        requestCompeledFlag = false;/*默认没完成*/
        date = new Date();
        
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

    public boolean isRequestCompeledFlag() {
        return requestCompeledFlag;
    }

    public void setRequestCompeledFlag(boolean requestCompeledFlag) {
        this.requestCompeledFlag = requestCompeledFlag;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public int getEnterpriseNum() {
        return enterpriseNum;
    }

    public void setEnterpriseNum(int enterpriseNum) {
        this.enterpriseNum = enterpriseNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return String.valueOf(purchaseRequestId);
    }
    
    
}
