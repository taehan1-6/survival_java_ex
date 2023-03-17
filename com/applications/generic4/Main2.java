package com.applications.generic4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Pokect<T> {
    private T data;

    public Pokect(T data) {
        super();
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pokect other = (Pokect) obj;
        return Objects.equals(data, other.data);
    }

    @Override
    public String toString() {
        return "Pokect [data=" + data + "]";
    }

    public void put(T data) {
        this.data = data;
    }

    public T get() {
        return this.data;
    }
}


public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("박경덕");
        list.add("이경덕");
        list.add("오경덕");
        list.add("김경덕");
        
//        Collections.sort(list);
        
        list.sort(null);
        
        System.out.println(list);
        
    }
}
