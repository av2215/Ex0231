package com.example.ex0231.targil2;

public class Kibbutz
{
    private Vehicles[] cars;
    private int camutCars;
    public Kibbutz()
    {
        cars=new Vehicles[500];
        camutCars=0;
    }
    public void hosafa(Vehicles car)
    {
        if(camutCars==500)
        {
            cars[499]=car;
        }
        else
        {
            cars[camutCars]=car;
            camutCars++;
        }
    }
    private Vehicles[] oldCar()
    {
        int ahzara=0;
        for(Vehicles bodek: cars)
        {
            if(bodek.getAge()>15 && bodek.getSteering().equals("hege"))
            {
                ahzara++;
            }
        }
        Vehicles[] carAhzara=new Vehicles[ahzara];
        int index=0;
        for(Vehicles bodek:cars)
        {
            if(bodek.getAge()>15 && bodek.getSteering().equals("hege"))
            {
                carAhzara[index]=bodek;
                index++;
            }
        }
        return carAhzara;
    }
    private int kalCars()
    {
        int count=0;
        for(Vehicles bodek: cars)
        {
            if((bodek instanceof Regular || bodek instanceof Light) && bodek.getSteering().equals("hege"))
            {
                count++;
            }
        }
        return count;
    }

}
