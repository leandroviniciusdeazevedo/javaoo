package com.ex2.entities;

public class Product {
    protected String name;
    protected Double price;

    public String priceTag(){
        System.out.print(name);
        System.out.printf(" $ %.2f", price);
        return "";
    }
    //contrutores

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}