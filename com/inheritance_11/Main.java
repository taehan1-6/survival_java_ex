package com.inheritance_11;

public class Main {
    public static void main(String[] args) {
        PoisonKinoko poisonKinokoA = new PoisonKinoko('A');
        System.out.println(poisonKinokoA.getSuffix());
        System.out.println(poisonKinokoA.getSkillPoint());
        
        Hero hero = new Hero(40);
        System.out.println(hero.getHp());
        System.out.println();
        
        poisonKinokoA.attack(hero);
        System.out.println(poisonKinokoA.getSkillPoint());
        System.out.println(hero.getHp());
        System.out.println();
        
        poisonKinokoA.attack(hero);
        System.out.println(poisonKinokoA.getSkillPoint());
        System.out.println(hero.getHp());
        System.out.println();
        
        poisonKinokoA.attack(hero);
        System.out.println(poisonKinokoA.getSkillPoint());
        System.out.println(hero.getHp());
        System.out.println();
        
        poisonKinokoA.attack(hero);
        System.out.println(poisonKinokoA.getSkillPoint());
        System.out.println(hero.getHp());
        System.out.println();
        
        poisonKinokoA.attack(hero);
        System.out.println(poisonKinokoA.getSkillPoint());
        System.out.println(hero.getHp());
        System.out.println();
        
//        poisonKinokoA.attack(hero);
//        System.out.println(poisonKinokoA.getSkillPoint());
//        System.out.println(hero.getHp());
//        System.out.println();
        
//        poisonKinokoA.attack(hero);
//        System.out.println(poisonKinokoA.getSkillPoint());
//        System.out.println(hero.getHp());
//        System.out.println();
        
    }
}
