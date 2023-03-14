package com.collection;

import java.util.ArrayList;

public class collectionEx3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "홍길동";
        person1.age = 20;
        person2.name = "한석봉";
        person2.age = 25;

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).name + 
                    "의 나이는 " + personList.get(i).age
                    + "살");
        }

    }
}
