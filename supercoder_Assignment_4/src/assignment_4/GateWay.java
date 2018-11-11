/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.io.IOException;
import java.util.Map;
import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Order;
import assignment_4.entities.Product;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    /*public static void main(String args[]) throws IOException{
        
        DataGenerator generator = DataGenerator.getInstance();
        
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;
        printRow(orderReader.getFileHeader());
        while((orderRow = orderReader.getNextRow()) != null){
            printRow(orderRow);
        }
        System.out.println("_____________________________________________________________");
        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        String[] prodRow;
        printRow(productReader.getFileHeader());
        while((prodRow = productReader.getNextRow()) != null){
            printRow(prodRow);
        }
    }
    
    public static void printRow(String[] row){
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }*/
    
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {     
        GateWay inst = new GateWay();
        inst.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = orderReader.getNextRow()) != null ){
            generateOrder(row);
        }
        while((row = productReader.getNextRow()) != null ){
            generateProduct(row);
        }
        
        runAnalysis();
    }
    
    private void generateOrder(String[] row)
    {
        int orderId = Integer.parseInt(row[0]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        
        Order u = new Order(orderId, salesId, customerId, productId, salesPrice, quantity);
        DataStore.getInstance().getOrders().put(orderId,u);
    }
    
    private void generateProduct(String[] row)
    {
        int product_Id = Integer.parseInt(row[0]);
        int target_Price = Integer.parseInt(row[3]);
        
        Product u = new Product(product_Id, target_Price);
        DataStore.getInstance().getProducts().put(product_Id,u);
    }
    

    
    private void runAnalysis(){
        
    }
    
}
