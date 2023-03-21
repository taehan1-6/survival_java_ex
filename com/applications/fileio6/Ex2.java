package com.applications.fileio6;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        File file = new File("data_copy.txt");
        File zipFile = new File("압축파일.zip");

        byte[] buf = new byte[4096];

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {

            try (FileInputStream fileIn = new FileInputStream(file)) {

                ZipEntry ze = new ZipEntry(file.getName());
                zipOut.putNextEntry(ze);

                int len;
                while ((len = fileIn.read(buf)) > 0) {
                    zipOut.write(buf, 0, len);
                }

                zipOut.closeEntry();
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("성공");

    }
}
