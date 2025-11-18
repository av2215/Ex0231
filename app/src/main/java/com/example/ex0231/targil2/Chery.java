package com.example.ex0231.targil2;

public class Chery extends Regular
{
    private boolean reverseCamera;

    public Chery(int carNumber, int amountOfWheels, String steering, int age, int zihom, int passengers, boolean reverseCamera) {
        super(carNumber, amountOfWheels, steering, age, zihom, passengers);
        this.reverseCamera = reverseCamera;
    }

    public boolean isReverseCamera() {
        return reverseCamera;
    }

    public void setReverseCamera(boolean reverseCamera) {
        this.reverseCamera = reverseCamera;
    }

    @Override
    public String toString() {
        return "chery{" +
                "reverseCamera=" + reverseCamera +
                '}'+ super.toString();
    }
}
