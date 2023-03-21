package com.applications.unittest10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

class Bank {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름이 잘못 되었음");
        }
        
        this.name = name;
    }
    
    
}

public class Ex1 {
    
    @Test
    public void setName_테스트() {
        Bank bank = new Bank();
        bank.setName("하나뱅크");
        
        assertEquals("하나뱅크", bank.getName());
    }
    
    @Test
    public void IllegalArgumentException_테스트() {
        IllegalArgumentException illegal =
                assertThrows(IllegalArgumentException.class, () -> new Bank().setName("하나뱅크"));
        
        String message = illegal.getMessage();
        assertEquals("이름이 잘못 되었음", message);
    }
    
    
}
