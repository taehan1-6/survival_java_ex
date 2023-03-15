package com.inheritance_11;

public class PoisonKinoko extends Kinoko {
    private int skillPoint;

    public PoisonKinoko(char suffix) {
        super(suffix);
        skillPoint = 5;
    }

    
    public int getSkillPoint() {
        return skillPoint;
    }

    public void setSkillPoint(int skillPoint) {
        this.skillPoint = skillPoint;
    }

    
    @Override
    public void attack(Hero hero) {
        // TODO Auto-generated method stub
        super.attack(hero);
        
        if (skillPoint > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            
            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);
            System.out.println(poisonDamage + " 포인트의 데미지");

            skillPoint--;
        } else {
            throw new IllegalArgumentException("skillPoint가 부족합니다.");
        }
    }
    
    
    
    
}
