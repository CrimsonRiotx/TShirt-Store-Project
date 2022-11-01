package com.ata;

import java.util.ArrayList;

public class Cart{
    public ArrayList <Product> products = new ArrayList<Product>();
    private double total;
    private final double taxRate = 10.00;
    
    public void addItem(Product p){
        products.add(p);
        this.total += p.getPrice();
      }
    
    public void showDetails(){
        if(products.size() == 0){
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        }else{
        System.out.println("--Cart--");
        System.out.println("Item Count: " + products.size());
        System.out.println("Items:");
        for(int n = 0; n<products.size(); n++) {
        System.out.println(String.format(products.get(n).getName() + ": $" + "%.2f",products.get(n).getPrice()));
        }
        System.out.println("");
        System.out.println("Pre-Tax Total: $" + total);
        total = (total + (total*(taxRate/100)));
        System.out.println("Post-Tax Total (10.00% Tax): $" + String.format("%.2f",total));
        }
    }
    
    public void checkout(){
        if(products.size() > 0){
        System.out.println("Your total is $" + String.format("%.2f",total));
        System.out.println("Thank you for shopping at T-Shirt Mart.");
        products.clear();
        } else {
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
        }
        //return true;
    }
}
