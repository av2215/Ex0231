package com.example.ex0231.targil2;

public class Main
{
    public static double amountZihom(Vehicles[] cars)
    {
        double sum=0;
        for(Vehicles bodek:cars)
        {
            sum+=bodek.exhaust();
        }
        return sum;
    }
    public static void amountRash(Vehicles[] cars)
    {
        for (Vehicles bodek:cars)
        {
            if(bodek instanceof Regular)
            {
                ((Regular)bodek).noise();
            }
        }
    }
    public static int sumUp(Vehicles[] cars)
    {
        int sum=0;
        for(Vehicles bodek:cars)
        {
            if(bodek instanceof Regular)
            {
                sum+=((Regular) bodek).getPassengers()-1;
            }
            else if (bodek instanceof Bicycle)
            {
                sum+=1;
            }

        }
        return sum;
    }
    private int aLotChargeCar(Vehicles[] cars)
    {
        int max=-1;
        int rightCarNumber=0;
        for(Vehicles bodek: cars)
        {
            if(bodek instanceof Cart && ((Cart) bodek).getMinCharging()>=max)
            {
                max=((Cart) bodek).getMinCharging();
                rightCarNumber=bodek.getCarNumber();
            }
        }
        return rightCarNumber;
    }
}
