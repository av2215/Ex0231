package com.example.ex0231.targil1;

public class Clothing extends Product
{
    private int softness; // 0-10

    public Clothing(int price, String name, String descripion, int softness) {
        super(price, name, descripion);
        this.softness = softness;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+"softness:"+softness;
    }
}
