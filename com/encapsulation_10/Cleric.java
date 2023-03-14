package com.encapsulation_10;

import java.util.Random;

public class Cleric {
    private String name;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    private int hp;
    private int mp;
    private int mpRecovery = new Random().nextInt(3);


    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }
    
    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

    void selfAid() {
        if (mp < 5) {
            System.out.println("mp부족");
        } else {
            this.mp -= 5;
            this.hp = MAX_HP;
        }
    }

    int pray(int second) {
        mpRecovery += second;
        mp += mpRecovery;
        if (mp > MAX_MP) {
            this.mp = MAX_MP;
        }
        return mpRecovery;
    }

    Cleric getself() {
        return this;
    }
}
