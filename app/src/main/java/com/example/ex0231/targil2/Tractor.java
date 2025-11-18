package com.example.ex0231.targil2;

public class Tractor extends Heavy{
    private String typeNigrarim;

    public Tractor(int carNumber, int amountOfWheels, String steering, int age, int zihom, int nigrarim, String typeNigrarim) {
        super(carNumber, amountOfWheels, steering, age, zihom, nigrarim);
        this.typeNigrarim = typeNigrarim;
    }

    public String getTypeNigrarim() {
        return typeNigrarim;
    }

    public void setTypeNigrarim(String typeNigrarim) {
        this.typeNigrarim = typeNigrarim;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "typeNigrarim='" + typeNigrarim + '\'' +
                '}' + super.toString();
    }
}
