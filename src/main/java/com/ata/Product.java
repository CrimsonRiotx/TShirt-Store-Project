package com.ata;

import java.util.ArrayList;

public class Product{
    private int id;
    private String name;
    private BigDecimal price;

    /*public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }*/
    
    public String getName(){
        return name;
    }
    
    public BigDecimal getPrice(){
        return price;
    }
    
    public int getID(){
        return id;
    }
    
    
}