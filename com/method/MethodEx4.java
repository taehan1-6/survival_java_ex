package com.method;


public class MethodEx4 {
    public double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }
    public double calcCircleArea(double radius) { 
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static void main(String[] args) {
        MethodEx4 figure = new MethodEx4();
 
        System.out.println(figure.calcTriangleArea(10.5, 5.2));
        System.out.println(figure.calcCircleArea(5.2));
    }
    
}
