package com.inheritance_11;

public class Hero {
    // field variable
    // global variable
    // member variable
    // property
    private String name; // field 변수
    private int hp; // 이 쪽 영역이 field
    private Sword sword;

    public static int money;

    
    Hero(String name, int hp) { // 강제로 반드시 name String 넣어야한다.
        this.name = name; // this는 field name , 우측은 파라미터의 name
        this.hp = hp;
    }

    Hero() {
        this.name = "noname";
        this.hp = 100;
    }

    Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    Hero(int hp) {
        this.name = "noname";
        this.hp = hp;
    }
    
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (this.hp < 0) {
            throw new IllegalArgumentException("이미 사망한 상태. hp가 0입니다.");
        } else {
            this.hp = hp;
        }
    }

    void attack() {}

    void run() {}

    void sit(int sec) {}

    void slip() {}

    void sleep() {
        hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}

