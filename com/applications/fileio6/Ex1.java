package com.applications.fileio6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        // 복사는 새로만들기 + 쓰기
        
//        File file = new File("data.txt");
        
        try {
            FileInputStream input = new FileInputStream(new File("data.txt"));
            
            FileOutputStream output = new FileOutputStream(new File("data_copy.txt"));
            
            int readBuffer = 0;
            byte [] buffer = new byte[512];
            
            while((readBuffer = input.read(buffer)) != -1) {
                output.write(buffer, 0, readBuffer);
            }
            
            System.out.println("파일이 복사되었습니다.");
        } catch (IOException e) {
            System.out.println(e);
        
        } 
        
//        finally {
//            try{
//            // 생성된 InputStream Object를 닫아준다.
//                input.close();
//            // 생성된 OutputStream Object를 닫아준다.
//                output.close();
//            } catch(IOException io) {
//                
//            }
//        }
    
    }
}
