package com.exception15;

import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        
        try {
            throw new IOException();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
