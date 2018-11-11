/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper 
{
    public void topThreeMostPopularProductSortedFromHighToLow()/*top 3 most popular product sorted from high to low*/
    {
        Map<Integer, Integer> productQuantityCount = new HashMap<>();
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        
        for(Order order :orders.values())
        {
            int quantityCount = 0;
            
            if(productQuantityCount.containsKey(order.getProductId()))
            {
                quantityCount = productQuantityCount.get(order.getProductId());
            }
            
            quantityCount += order.getQuantity();
            
            productQuantityCount.put(order.getProductId(), quantityCount);
        }
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(productQuantityCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o2.getValue()-o1.getValue();
            }
        });
        
        System.out.print("\n");
        System.out.print("top 3 most popular product sorted from high to low: \n");
        for(int i =0; i<3 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
    
    public void topThreeBestCustomers()/*top 3 best customers*/
    {
        Map<Integer, Integer> customerBuyQuantityCount = new HashMap<>();
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        
        for(Order order :orders.values())
        {
            int quantityCount = 0;
            
            if(customerBuyQuantityCount.containsKey(order.getCustomerId()))
            {
                quantityCount = customerBuyQuantityCount.get(order.getCustomerId());
            }
            
            quantityCount += order.getQuantity();
            
            customerBuyQuantityCount.put(order.getCustomerId(), quantityCount);
        }
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(customerBuyQuantityCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o2.getValue()-o1.getValue();
            }
        });
        
        System.out.print("top 3 best customers: \n");
        for(int i =0; i<3 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
    
    public void  topThreeBestSalesPeople()/* top 3 best sales people*/
    {
        Map<Integer, Integer> salesBenefitCount = new HashMap<>();
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        
        for(Order order :orders.values())
        {
            int totalBenefitCount = 0;
            
            if(salesBenefitCount.containsKey(order.getSalesId()))
            {
                totalBenefitCount = salesBenefitCount.get(order.getSalesId());
            }
            
            Product product = products.get(order.getProductId());
            int targetPrice = product.getTarget_Price();
            
            totalBenefitCount += order.getQuantity()*(order.getSalesPrice() - targetPrice);
            
            salesBenefitCount.put(order.getSalesId(), totalBenefitCount);
        }
        
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(salesBenefitCount.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
            {
		return o2.getValue()-o1.getValue();
            }
        });
        
        System.out.print("top 3 best sales people: \n");
        for(int i =0; i<3 ;i ++)
        {
            String id = infoIds.get(i).toString();
            System.out.print(id + "  "+"\n");
        }
        System.out.print("\n");
    }
    
    public void totalRevenue()/*total revenue for the year*/
    {
        int totalRevenue = 0;
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        
        for(Order order :orders.values())
        {   
            totalRevenue += order.getQuantity() * order.getSalesPrice();
        }
        

        
        System.out.print("total revenue for the year: \n");
        System.out.print(totalRevenue + "  "+"\n");
        System.out.print("\n");
    }
}



