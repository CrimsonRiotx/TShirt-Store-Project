package com.ata;

import java.util.ArrayList;

public class Shop{
   private String name;
   private ArrayList<Product> products;
    
    //constructors
    public Shop (ArrayList<Product> products){
        this.products = products;
    }
    
    public String getName(){
        return name;
    }
    
    //Prints the product list
    public void printProducts(){
        System.out.println("--Products--");
        for(Product product : products){
            System.out.println("ID " + product.getID() + ": " + product.getName() + " - $" + product.getPrice());
        }
    }
    
    //find products
   public int findProducts(String searchText){
        int result = 0;
        for(int i = 0; i < products.size(); i++){
            String currentProduct = products.get(i).getName();
            if(currentProduct.equals(searchText)){
                result = i;
                break;
            }
            result = -1;
        } return result;


    }
    
    
}
