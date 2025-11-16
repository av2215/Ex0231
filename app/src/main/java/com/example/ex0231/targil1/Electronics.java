package com.example.ex0231.targil1;

public class Electronics extends Product
{
    private int battery;

    public Electronics(int price, String name, String descripion, int battery) {
        super(price, name, descripion);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+"battery:"+battery;
    }
}
