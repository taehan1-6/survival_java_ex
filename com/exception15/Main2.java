package com.exception15;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        // 위와 같이 메인메소드에 throws로 던져서 예외처리하는 방법은 무책임한 방법이다.
        // 그래서 아래와 같이 기능메소드에서 예외처리 하도록 하자.
//        Thread.sleep(1000);
        something();
        
    }
    
    public static void something() throws InterruptedException {
        Thread.sleep(1000);
    }
}
