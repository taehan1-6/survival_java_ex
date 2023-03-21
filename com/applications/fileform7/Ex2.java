package com.applications.fileform7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 81923983183821L;
    String name;
    int age;
}

class Department {
    String name;
    Employee leader;
}

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Employee hong = new Employee();
        hong.name = "홍길동";
        hong.age = 41;
        
        FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hong);
        oos.flush();
        oos.close();
    }
}
