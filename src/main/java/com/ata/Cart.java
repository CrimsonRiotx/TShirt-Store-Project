package com.ata;

import java.util.ArrayList;

public class Cart{
    //Attributes
    private ArrayList<Product> items;
    private BigDecimal total;
    private double taxRate;

    public void addItem(Product p){

    }
    public void showDetails(){
        if(items.size() == 0){
            System.out.println("The cart is empty. Please add at least on product to see it in the cart.");
        }
    }
    public boolean checkout(){

    }
    private void appendCartHeaderToStringBuilder(StringBuilder sb){
    
    }
    private void appendItemsWithPricesToStringBuilder(StringBuilder sb){
    
    }
    private void appendCartTotalsToStringBuilder(StringBuilder sb){
    
    }
}