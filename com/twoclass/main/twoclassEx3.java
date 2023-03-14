package com.twoclass.main;

public class twoclassEx3 {
    public static void main(String[] args) {
        for (int i = 0; i < 59 + 1; i++) {
            for (int j = 1; j < 12 + 1; j++) {
                System.out.printf("%d:%02d ", j, i);
            }
            System.out.println();
        }
    }
}