package com.class_9;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric("경민용사", 10, 5);
        
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);
        System.out.println();
        
        cleric.selfAid();
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);
        System.out.println();
        
        cleric.selfAid();
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);
        System.out.println();
        
        
    }
}
