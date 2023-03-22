package com.applications.design12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 싱글톤패턴 예제 클래스
final class MyLogger {
    private static MyLogger instance;

    // private 생성자로 new 금지
    private MyLogger() {}

    // static 메소드로 1개의 인스턴스 사용 강제화
    public static MyLogger getInstance() throws IOException {
        if (instance == null) {
            instance = new MyLogger();
        }

        // Java8 이후에는 try()에서 자동으로 close처리 해준다.
        try (FileReader fileReader = new FileReader("dummylog.txt")) {

            int i = fileReader.read();
            while (i != -1) {
                char character = (char) i;
                System.out.print(character);
                i = fileReader.read();
            }
        }

        return instance;
    }

    public void log(String text) throws IOException {
        try (FileWriter fileWriter = new FileWriter("dummylog.txt", true)) {
            fileWriter.write(text);
            fileWriter.flush();
        }
    }
}

class InstanceEx {
    // 예시를 보기 위해 만든 일반적인 클래스
}


public class Ex1 {
    public static void main(String[] args) throws IOException {
        MyLogger logger1 = MyLogger.getInstance();
        logger1.log("first");
        System.out.println();
        
        MyLogger logger2 = MyLogger.getInstance();
        logger2.log("second");

        // 싱글톤패턴을 적용한 클래스는 인스턴스를 1개만 사용하게 강제한다.
        System.out.println();
        System.out.println();
        System.out.println(logger1 + " vs " + logger2);
        System.out.println(logger1 == logger2);
        System.out.println(logger1.equals(logger2));
        
        // 일반적인 클래스이다.
        InstanceEx ins1 = new InstanceEx();
        InstanceEx ins2 = new InstanceEx();
        System.out.println();
        System.out.println(ins1 + " vs " + ins2);
        System.out.println(ins1 == ins2);
        System.out.println(ins1.equals(ins2));


    }
}


