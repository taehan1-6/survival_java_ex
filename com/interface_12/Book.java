package com.interface_12;

public class Book extends TangibleAsset {
    private String isbn;
    
    
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }
    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        // TODO Auto-generated method stub
        super.setPrice(price);
    }

    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        // TODO Auto-generated method stub
        super.setWeight(weight);
    }
    
}
