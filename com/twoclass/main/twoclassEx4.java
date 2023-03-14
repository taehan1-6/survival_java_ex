package com.twoclass.main;

import java.util.Random;
import java.util.Scanner;

public class twoclassEx4 {
    public static void main(String[] args) {
        System.out.println("던질 횟수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        
        long tries = sc.nextLong();
        int hits = 0;
        
        Random random = new Random();
        for (int i = 0; i < tries; i++) {
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            
            // 원점과 다트가 꽂힌 자리 사이의 거리가 0 ~ 1이어야 하므로
            double distance = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
            if (distance < 1 && distance > 0) {
                hits++;
            }
        }
        
        double piEstimate = 4 * (double)hits / (double)tries;
        
        System.out.println(piEstimate);
    }
}
