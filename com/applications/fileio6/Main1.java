package com.applications.fileio6;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt", true);
        fw.write("Hello World");
        fw.flush();
        fw.close();
    }
}
