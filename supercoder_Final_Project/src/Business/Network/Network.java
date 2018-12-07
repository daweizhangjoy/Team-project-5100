/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Communal_Communal_PurchaseRequest.PurchaseRequestDirectory;
import Business.Communal_Customer.CustomerDirectory;
import Business.Communal_Pet.PetDirectory;
import Business.Communal_PetCase.PetCaseDirectory;
import Business.Communal_TotalSupply.TotalSupplyDirectory;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private CustomerDirectory customerDirectory;
    private PurchaseRequestDirectory purchaseRequestDirectory;
    private PetDirectory petDirectory;
    private PetCaseDirectory petCaseDirectory;
    private TotalSupplyDirectory totalSupplyDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private int networkID;
    private static int counter=0;
    
    public Network(String name){
        this.name = name;
        enterpriseDirectory=new EnterpriseDirectory();
        customerDirectory = new CustomerDirectory();
        purchaseRequestDirectory = new PurchaseRequestDirectory();
        petDirectory = new PetDirectory();
        petCaseDirectory = new PetCaseDirectory();
        totalSupplyDirectory = new TotalSupplyDirectory();
        
        networkID = counter;
        ++counter;
    }
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public PurchaseRequestDirectory getPurchaseRequestDirectory() {
        return purchaseRequestDirectory;
    }

    public void setPurchaseRequestDirectory(PurchaseRequestDirectory purchaseRequestDirectory) {
        this.purchaseRequestDirectory = purchaseRequestDirectory;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }

    public PetCaseDirectory getPetCaseDirectory() {
        return petCaseDirectory;
    }

    public void setPetCaseDirectory(PetCaseDirectory petCaseDirectory) {
        this.petCaseDirectory = petCaseDirectory;
    }

    public TotalSupplyDirectory getTotalSupplyDirectory() {
        return totalSupplyDirectory;
    }

    public void setTotalSupplyDirectory(TotalSupplyDirectory totalSupplyDirectory) {
        this.totalSupplyDirectory = totalSupplyDirectory;
    }

    public int getNetworkID() {
        return networkID;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
