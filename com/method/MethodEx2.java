package com.method;

// 더 중복을 제거한 코드
public class MethodEx2 {
    public void email(String title, String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }
    
    public void email(String address, String text) {
        email("제목없음", address, text);
    }

    public static void main(String[] args) {
        MethodEx2 taehwan = new MethodEx2();
        
        taehwan.email("1번메일", "user@gmail.com", "안녕하세요");
        taehwan.email("user@gmail.com", "안녕하세요");
        
    }
}
