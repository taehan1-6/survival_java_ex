package com.exception15;

public class Ex2 {
    public static void main(String[] args) {
        String s = null;
        
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("---- stacl trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stacl trace (여기부터) ----");
        }
        
        
    }
}
