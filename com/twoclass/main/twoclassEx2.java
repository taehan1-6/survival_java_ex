package com.twoclass.main;

public class twoclassEx2 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %2d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
