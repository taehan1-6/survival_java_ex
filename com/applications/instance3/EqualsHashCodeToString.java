package com.applications.instance3;

import java.util.*;

class Hero {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EqualsHashCodeToString {
    public static void main(String[] args) {
//        Set<Hero> list = new HashSet<>();
        List<Hero> list = new ArrayList<>();
        
        Hero h = new Hero();
        System.out.println(h);
        System.out.println(h.name);
        System.out.println();
        
        System.out.println(h.hashCode());
        System.out.println();
        
        h.name = "kkk";
        System.out.println(h.name);
        System.out.println();
        
        System.out.println(list.size());
        System.out.println();
        
        list.add(h);
        System.out.println(list.size());
        System.out.println();
        
        h = new Hero();
//        x = new Hero();
        System.out.println(h);
        System.out.println(h.name);
        System.out.println();
        
        System.out.println(h.hashCode());
        System.out.println();
        
        
        System.out.println(list.size());
        System.out.println();
        
        h.name = "kkk";
        System.out.println(h);
        System.out.println(h.name);
        System.out.println();
        
        System.out.println(h.hashCode());
        System.out.println();
        
//        list.add(h);
//        System.out.println(list.size());
//        
//        list.add(h);
//        System.out.println(list.size());
        
        list.remove(h);
        System.out.println(list.size());
        System.out.println();
        
        System.out.println(h.hashCode());
        System.out.println();
        
        
        System.out.println(list.toString());
        System.out.println(list.hashCode());
        System.out.println(list == h);
        System.out.println();
        
        System.out.println(list.get(0).hashCode());
        System.out.println(Objects.equals(list.get(0), h));
        
    }
}
