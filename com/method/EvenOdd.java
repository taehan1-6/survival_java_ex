package com.method;

import java.util.Scanner;

public class EvenOdd {
    public static String solution(int N, int M) {
        String answer = "NO";
        
        if (N % 2 == 0 && M % 2 != 0) {
            answer = "YES";
        } else if (M % 2 == 0 && N % 2 != 0) {
            answer = "YES";
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        System.out.println(solution(N, M));
        
    }
}
