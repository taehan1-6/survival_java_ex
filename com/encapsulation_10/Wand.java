package com.encapsulation_10;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        
        this.name = name;
    }
    
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5) {
            throw new IllegalArgumentException("마력이 0.5 미만임");
        }
        if (power > 100.0) {
            throw new IllegalArgumentException("마력이 100.0 초과임");
        }
        
        this.power = power;
    }
}
