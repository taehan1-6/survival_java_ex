package com.polymorphism13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface X {
    void a();
}


abstract class Y implements X {
    public abstract void a();
    public abstract void b();
}


class A extends Y {
    @Override
    public void a() {
        System.out.println("Aa");
    }

    @Override
    public void b() {
        System.out.println("Ab");
    }

    public void c() {
        System.out.println("Ac");
    }
}


class B extends Y {
    @Override
    public void a() {
        System.out.println("Ba");
    }

    @Override
    public void b() {
        System.out.println("Bb");
    }

    public void c() {
        System.out.println("Bc");
    }
}


public class Ex3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        List<Y> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        Iterator<Y> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }

        // for (Y y : list) {
        // y.b();
        // }
    }


}
