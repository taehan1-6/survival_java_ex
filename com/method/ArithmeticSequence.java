package com.method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class ArithmeticSequence {
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


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String m = br.readLine(); // 문자열 받기
        // int m = Integer.parseInt(bf.readLine()); // 정수 받기

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution(m, n));
        bw.flush();
        bw.close();
    }

}
