package com.class_9;

import java.util.Random;

public class Cleric {
    String name;

    final static int MAX_HP = 50;
    final static int MAX_MP = 10;

    int hp;
    int mp;
    int mpRecovery = new Random().nextInt(3);


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
