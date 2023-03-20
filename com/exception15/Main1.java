package com.exception15;

import java.io.FileWriter;

public class Main1 {
    public static void main(String[] args) {
        try {
//            FileWriter fw = new FileWriter("data.txt"); // 예외가 안터지는 사례라 걍 다른거 해줌 밑에
            int[] nums = {0, 1, 2};
            nums[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
