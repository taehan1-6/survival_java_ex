package com.applications.thread11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        StringBuilder sb = new StringBuilder();
        
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    sb.append(i);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    sb.append(i);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }).start();
        
    }
}
