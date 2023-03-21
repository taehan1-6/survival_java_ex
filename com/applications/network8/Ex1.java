package com.applications.network8;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Ex1 {
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        // 바이트배열로 뱉어주는 클래스??
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        // 왜 버퍼 바이트의 크기는 1024인지??
        byte[] buffer = new byte[1024];
        
        int len;
        // 입력 스트림에서 바이트를 읽고 버퍼에 저장
        while ((len = inputStream.read(buffer)) != -1) {
            // 버퍼에서 출력 스트림으로 바이트 쓰기
            byteArrayOutputStream.write(buffer, 0, len);
        }
        
        return byteArrayOutputStream.toByteArray();
    }
    
    public static void main(String[] args) throws IOException {
        // 주소의 그림 파일을 읽고 -> 저장한다.
        
        // URL으로 웹의 주소를 받아서
        URL url = new URL("https://alimipro.com/favicon.ico");
        // URL클래스의 openStream()메소드로 -> 받아온 url을 inputStream의 객체를 생성해줌.
        // 이 메소드는 해당 url의 자원 가져오기 가능
        InputStream inputStream = url.openStream();
        
        
        // 파일(URL로 웹에서 가져온 정보)를 어디에 어떻게 저장할 것이냐
        FileOutputStream fileOutputStream = new FileOutputStream("icon.ico");
        // FileOutputStream클래스의 write()메소드를 사용해주기 위해
        // InputStream 타입을 -> byte[] 타입으로 바꿔주어야 한다.
        fileOutputStream.write(toByteArray(inputStream));
          
        inputStream.close();

    }
}