package com.example.ex0231.targil2;

public class Mercedes extends Truck
{
    private boolean repud;

    public Mercedes(int carNumber, int amountOfWheels, String steering, int age, int zihom, int nigrarim, int maxKaved, boolean repud) {
        super(carNumber, amountOfWheels, steering, age, zihom, nigrarim, maxKaved);
        this.repud = repud;
    }

    public boolean isRepud() {
        return repud;
    }

    public void setRepud(boolean repud) {
        this.repud = repud;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "repud=" + repud +
                '}'+super.toString();
    }
}
