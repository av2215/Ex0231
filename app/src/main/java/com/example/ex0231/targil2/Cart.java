package com.example.ex0231.targil2;

public class Cart extends Light{
    private int minCharging;

    public Cart(int carNumber, int amountOfWheels, String steering, int age, int zihom, boolean manoa, int minCharging) {
        super(carNumber, amountOfWheels, steering, age, zihom, manoa);
        this.minCharging = minCharging;

    }

    public int getMinCharging() {
        return minCharging;
    }

    public void setMinCharging(int minCharging) {
        this.minCharging = minCharging;
    }
    @Override
    public double exhaust()
    {
        return 0;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "minCharging=" + minCharging +
                '}'+super.toString();
    }
}
