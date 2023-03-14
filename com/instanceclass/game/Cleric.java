package com.instanceclass.game;

import java.util.Random;

public class Cleric {
    String name;

    final int MAX_HP = 50;
    final int MAX_MP = 10;

    int hp = MAX_HP;
    int mp = MAX_MP;

    int mpRecovery = new Random().nextInt(3);
    
    public Cleric() {
        // TODO Auto-generated constructor stub
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
        if (mp > this.MAX_MP) {
            this.mp = this.MAX_MP;
        }

        // mp = Math.min(mp, MAX_MP); ???

        return mpRecovery;
    }
    
    Cleric getself() {
        return this;
    }
}
