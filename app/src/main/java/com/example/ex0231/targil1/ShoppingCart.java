package com.example.ex0231.targil1;

public class ShoppingCart
{
    private Product[] prod;

    public int calculateTotal()
    {
        int sum=0;
        for (Product preduct:prod)
        {
            sum=sum+preduct.getPrice();
        }
        return sum;
    }
}
