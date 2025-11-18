package com.example.ex0231.targil2;

public class Regular extends Vehicles{
    private int passengers;

    public Regular(int carNumber, int amountOfWheels, String steering, int age, int zihom, int passengers) {
        super(carNumber, amountOfWheels, steering, age, zihom);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    @Override
    public double exhaust()
    {
        return super.exhaust()*0.67;
    }
    public void noise()
    {
        System.out.println("the noise is annoying");
    }
    public void hitchhikers()
    {
        System.out.println("please take us");
    }
    @Override
    public String toString() {
        return "Regular{" +
                "passengers=" + passengers +
                '}' + super.toString();
    }
}
