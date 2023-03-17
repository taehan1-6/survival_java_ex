package com.applications.generic4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


class StudentNameAscComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentIdAscComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(0, "김재영"));
        students.add(new Student(1, "김관중"));
        students.add(new Student(3, "강태환"));

        System.out.println(students);
        
        // 1번은 SRP(단일책임원칙)에 의거하여 짠 코드??
        students.sort(new StudentNameAscComparator());
//        System.out.println(students);
        
        
        // 2번(익명클래스)이 더 안좋다. 왜냐하면 2번은 유지보수가 어렵다. 어디가 어디부분인지 몰라서
        // 수정하기가 너무 어렵다.
        // 그래서 설계적으로 안좋지만 -> 이런 코드를 볼 수도 있기에 알아만 두자.
        students.sort(new Comparator<Student>() {
            
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        
//        Collections.sort(students);
        
        System.out.println(students);
        
    }
}



class Student {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}