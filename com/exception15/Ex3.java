package com.exception15;

public class Ex3 {
    public static void main(String[] args) {
        
        try {
            int i = Integer.parseInt("Three");
        } catch (NumberFormatException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
