package com.instanceclass.game;

public class Hero {
    // field variable (자바 국룰 용어)
    // global variable
    // member variable (자바 국룰 용어)
    // property
    String name;
    int hp;
    
    void attack() {}
    void run() {}
    void sit(int sec) {}
    void slip() {}
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "adsasd");
    }
}
