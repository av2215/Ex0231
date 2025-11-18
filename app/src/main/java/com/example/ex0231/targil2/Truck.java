package com.example.ex0231.targil2;

public class Truck extends Heavy{
    private int maxKaved;

    public Truck(int carNumber, int amountOfWheels, String steering, int age, int zihom, int nigrarim, int maxKaved) {
        super(carNumber, amountOfWheels, steering, age, zihom, nigrarim);
        this.maxKaved = maxKaved;
    }

    public int getMaxKaved() {
        return maxKaved;
    }

    public void setMaxKaved(int maxKaved) {
        this.maxKaved = maxKaved;
    }
    @Override
    public double exhaust()
    {
        return 1.5*super.exhaust();
    }
    @Override
    public String toString() {
        return "Truck{" +
                "maxKaved=" + maxKaved +
                '}' + super.toString();
    }
}
