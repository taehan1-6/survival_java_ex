package com.applications.instance3;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return (id < o.id) ? -1 : ((id == o.id) ? 0 : 1);
//        return this.name.compareTo(o.name) * -1;
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


public class ComparableCompareTo {
    public static void main(String[] args) {
        // 내가 만든 Student 클래스에 정렬(sort)을 해주기 위해 Comparable 인터페이스를 구현 후
        // compareTo 메소드를 오버라이드 해서, 내 맛대로 맞춰서 sort하는 예제
        
        List<String> strs = new ArrayList<>();

        strs.add("이동학");
        strs.add("박경덕");
        strs.add("강태근");
        strs.add("최유림");

        Collections.sort(strs);
        System.out.println(strs);


        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(2);

        Collections.sort(nums);
        System.out.println(nums);
        
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student(0, "이동학"));
        students.add(new Student(3, "최유림"));
        students.add(new Student(1, "박경덕"));
        students.add(new Student(2, "강태근"));
        
        Collections.sort(students);
        System.out.println(students);

    }
}
