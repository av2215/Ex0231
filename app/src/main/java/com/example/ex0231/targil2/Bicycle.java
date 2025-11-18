package com.example.ex0231.targil2;

public class Bicycle extends Light{
    private boolean salsela;

    public Bicycle(int carNumber, int amountOfWheels, String steering, int age, int zihom, boolean manoa, boolean salsela) {
        super(carNumber, amountOfWheels, steering, age, zihom, manoa);
        this.salsela = salsela;
    }

    public boolean isSalsela() {
        return salsela;
    }

    public void setSalsela(boolean salsela) {
        this.salsela = salsela;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "salsela=" + salsela +
                '}' + super.toString();
    }
}
