package com.interface_12;

public abstract class TangibleAsset extends Asset implements Thing {
    private int price;
    private String color;
    
    
    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setWeight(double weight) {
        // TODO Auto-generated method stub

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
}
