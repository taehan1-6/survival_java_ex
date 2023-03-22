package com.applications.thread11;


class Counter implements Runnable {
    private long count = 0;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void run() {

    }

    public synchronized void add(long i) {
        System.out.println("더하기");
        count += i;
    }

    public synchronized void mul(long i) {
        System.out.println("곱하기");
        count *= i;
    }
}


public class Ex2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    counter.add(5);
                    System.out.println(counter.getCount());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }


        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    counter.mul(2);
                    System.out.println(counter.getCount());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
