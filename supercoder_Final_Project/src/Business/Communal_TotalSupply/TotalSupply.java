/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Communal_TotalSupply;

import Business.Communal_Pet.PetDirectory;

/**
 *
 * @author 15142087777的AW
 */
public class TotalSupply {
    private String supplyName;
    private int supplyQuantity;
    private int supplyId;
    private Category category;
    
    public enum Category
    {
        MEDICINE("Medicine", 1), FOOD("Food", 2), ACCESORRY("白色", 3);  
        // 成员变量  
        private String name;  
        private int index;  
        
// 构造方法  
        private Category(String name, int index) {  
            this.name = name;  
            this.index = index;  
        }  
        
        public String getValue() {
            return name;
        }
        
        //覆盖方法  
        @Override  
        public String toString() 
        {  
            return name;  
        }
    }
    
    private static int count = 1;

    public TotalSupply() {
        supplyId = count;
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

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TotalSupply.count = count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return supplyName.concat("*" + Integer.toString(supplyQuantity));
    }
    
}
