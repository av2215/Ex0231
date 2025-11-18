package com.example.ex0231.targil2;

public class Heavy extends Vehicles{
    private int nigrarim;

    public Heavy(int carNumber, int amountOfWheels, String steering, int age, int zihom, int nigrarim) {
        super(carNumber, amountOfWheels, steering, age, zihom);
        this.nigrarim = nigrarim;


    }
    public int getNigrarim() {
        return nigrarim;
    }

    public void setNigrarim(int nigrarim) {
        this.nigrarim = nigrarim;
    }
    @Override
    public double exhaust()
    {
        return super.exhaust()+500*nigrarim;
    }
    @Override
    public String toString() {
        return "Heavy{" +
                "nigrarim=" + nigrarim +
                '}' + super.toString();
    }


}
