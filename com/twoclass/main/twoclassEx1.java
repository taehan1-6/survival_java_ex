package com.twoclass.main;

import java.lang.*;

public class twoclassEx1 {
    public static void main(String[] args) throws Exception {
        System.out.println("3초간 기다림!");
        
        // 3초간 기다리는 코드
        Thread.sleep(3000);

        System.out.println("끝");
    }
}
