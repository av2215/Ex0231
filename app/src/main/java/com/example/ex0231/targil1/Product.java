package com.example.ex0231.targil1;

public class Product
{
    private int price;
    private String name;
    private String descripion;
    public Product(int price, String name, String descripion)
    {
        this.price = price;
        this.name = name;
        this.descripion = descripion;
    }
    public String getDescription() {
        return descripion;
    }

    public void setDescription(String description) {
        this.descripion = descripion;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    }

