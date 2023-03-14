package com.Array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};

        System.out.println("1자리의 숫자를 입력 해 주세요");

        int input = new java.util.Scanner(System.in).nextInt();

        for (int num : numbers) {
            if (input == num) {
                System.out.println("정답!");
                break;
            }
        }
    }
}
