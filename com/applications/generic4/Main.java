package com.applications.generic4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        
        list.add(1);
        list.add("홍길동");
        list.add(null);
        list.add(3.0);
        list.add(true);
        
        Object object = (int) list.get(0);
        
        if (object instanceof Integer) {
            System.out.println((int) list.get(0) + 10);
        }
        
//        System.out.println((int) list.get(0) + 10);
        
    }
}
