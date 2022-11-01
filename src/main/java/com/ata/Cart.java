package com.ata;

import java.util.ArrayList;

public class Cart{
    private ArrayList <Product> items = new ArrayList<Product>();
    private double total;
    private final double taxRate = 10.00;
    
    public void addItem(Product p){
        items.add(p);
        total += p.getPrice();
    }
    
    public void showDetails(){
        if(items.size() == 0){
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        }else{
        System.out.println("--Cart--");
        System.out.println("Item Count: " + items.size());
        System.out.println("Items: ");
        System.out.println("");
        System.out.println("Pre-Tax Total: " + total);
        System.out.println("Post-Tax Total (10.00% Tax): " + (total + (taxRate/100)));
        }
    }
    
    public boolean checkout(){
        return true;
    }
}
