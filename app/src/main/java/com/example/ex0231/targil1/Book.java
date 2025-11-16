package com.example.ex0231.targil1;

public class Book extends Product
{
    private int severalPages;

    public Book(int price, String name, String descripion, int severalPages) {
        super(price, name, descripion);
        this.severalPages = severalPages;
    }

    public int getSeveralPages() {
        return severalPages;
    }

    public void setSeveralPages(int severalPages) {
        this.severalPages = severalPages;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+"several pages:"+severalPages;
    }
}
