package com.method;

public class MethodEx1 {
    public static void introduceOneself() {
        String name = "강태환";
        int age = 27;
        double height = 179.3;
        String gender = "남성";
        
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("성별: " + gender);
    }
    
    public static void main(String[] args) {
//        MethodEx1 taehwan = new MethodEx1();
        
//        taehwan.introduceOneself();
        
        introduceOneself();
    }
}
