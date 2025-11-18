package com.example.ex0231.targil2;

public class Vehicles {
    private int carNumber;
    private int amountOfWheels;
    private String steering;
    private int age;
    private int zihom;
    public Vehicles(int carNumber, int amountOfWheels, String steering, int age, int zihom) {
        this.carNumber = carNumber;
        this.amountOfWheels = amountOfWheels;
        this.steering = steering;
        this.age = age;
        this.zihom = zihom;
    }
    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZihom() {
        return zihom;
    }

    public void setZihom(int zihom) {
        this.zihom = zihom;
    }
    public double exhaust()
    {
       return zihom*60;
    }
    @Override
    public String toString() {
        return "Vehicles{" +
                "carNumber=" + carNumber +
                ", amountOfWheels=" + amountOfWheels +
                ", steering='" + steering + '\'' +
                ", age=" + age +
                ", zihom=" + zihom +
                '}';
    }
}
