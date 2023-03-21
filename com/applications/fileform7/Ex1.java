package com.applications.fileform7;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("data.properties");
        Properties prop = new Properties();
        prop.load(fr);
        String useAndroidX = prop.getProperty("android.useAndroidX");
        
        System.out.println(useAndroidX);
        
    }
}
