package com.example.ex0231.targil2;

public class Light extends Vehicles{
    private boolean manoa;

    public Light(int carNumber, int amountOfWheels, String steering, int age, int zihom, boolean manoa) {
        super(carNumber, amountOfWheels, steering, age, zihom);
        this.manoa = manoa;
    }

    public boolean isManoa() {
        return manoa;
    }

    public void setManoa(boolean manoa) {
        this.manoa = manoa;
    }

    @Override
    public String toString() {
        return "Light{" +
                "manoa=" + manoa +
                '}' + super.toString();
    }
}
