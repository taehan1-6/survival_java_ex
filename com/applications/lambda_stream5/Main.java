package com.applications.lambda_stream5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i) + 1);
            }
        }

        // 위와 동일한 람다식, 스트림 코드
        nums.stream().filter((num) -> num % 2 == 0) // if처럼 거르기
                .map((num) -> num + "번") // 변환(Integer -> String으로 형변환함)
                .forEach((num) -> System.out.println(num + 1)); // for처럼 반복


        List<String> names = new ArrayList<>();
        names.add("박경덕");
        names.add("박준하");
        names.add("이동학");
        names.add("박태현");


        List<String> parks = getParkList(names);
        System.out.println(parks);

        // 스트림으로 구한 것
        System.out.println(names.stream()
                .filter(name -> name.startsWith("박"))
                .collect(Collectors.toList()));
    }

    public static List<String> getParkList(List<String> names) {
//        return names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
        
        List<String> result = new ArrayList<>();
        
        for (String name : names) {
            if (name.startsWith("박")) {
                result.add(name);
            }
        }
        
        return result;
    }

}
