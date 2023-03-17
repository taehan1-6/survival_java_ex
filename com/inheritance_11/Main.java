package com.inheritance_11;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("ddd");
        System.out.println(weapon.getName());
        
        Weapon weapon1 = new Weapon();
        System.out.println(weapon1.getName());
        System.out.println(weapon1.getPrice());
    }
}
