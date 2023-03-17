package com.applications.generic4;

import java.util.ArrayList;
import java.util.List;

class Pocket {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }  
}

public class NoGeneric {
    public static void main(String[] args) {
        Pocket p = new Pocket();

        System.out.println(p.getData());
        System.out.println();

        p.setData(1234);        
        System.out.println(p.getData());
        
        p.setData("문자열");
        System.out.println(p.getData());
        
        p.setData(p);        
        System.out.println(p.getData());
        
        p.setData(true);        
        System.out.println(p.getData());
        System.out.println();
        
        // Object 타입의 data들을 List에 넣어봄
        List<Object> list = new ArrayList<>();
        
        list.add(1234);        
        list.add("문자열");
        list.add(p); 
        list.add(true);        
        System.out.println(list);
        
        

    }
}
