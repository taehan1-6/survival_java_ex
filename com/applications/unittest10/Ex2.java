package com.applications.unittest10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

interface Counter {
    public int count();
}

class UpCounter implements Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public int count() {
        return ++count;
    }
}

class DownCounter implements Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public int count() {
        return --count;
    }

}

public class Ex2 {
    
    @Test
    public void UpCounter클래스_테스트() {
        UpCounter upCounter = new UpCounter();
        upCounter.setCount(5);
        assertEquals(5, upCounter.getCount());
        
        upCounter.count();
        assertEquals(6, upCounter.getCount());
    }
    
    @Test
    public void DownCounter클래스_테스트() {
        DownCounter downCounter = new DownCounter();
        downCounter.setCount(5);
        assertEquals(5, downCounter.getCount());
        
        downCounter.count();
        assertEquals(4, downCounter.getCount());
    }
    
}
