/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import java.util.HashMap;
import java.util.Map;
import assignment_4.entities.Order;
import assignment_4.entities.Product;

/**
 *
 * @author harshalneelkamal
 */
public class DataStore {
    
    private static DataStore dataStore;
    
    private Map<Integer, Order> orders;
    private Map<Integer, Product> products;
    
    private DataStore(){
        orders = new HashMap<>();
        products = new HashMap<>();
    }
    
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }
}
