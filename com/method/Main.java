package com.method;

import java.util.Scanner;

public class Main {
    public static String solution(int m, int n) {
        String answer = "";
        StringBuilder temp = new StringBuilder();

        temp.append(m);
        for (int i = 0; i < 9; i++) {
            m = m + n;
            temp.append(" " + m);
        }

        answer = temp.toString();

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(solution(m, n));

    }

}
