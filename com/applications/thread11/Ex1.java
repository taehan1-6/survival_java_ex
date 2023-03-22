package com.applications.thread11;

class CountUpThread {

    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }
    }
}


public class Ex1 {
    public static void main(String[] args) {
        CountUpThread countUpThread1 = new CountUpThread();
        CountUpThread countUpThread2 = new CountUpThread();
        CountUpThread countUpThread3 = new CountUpThread();

        countUpThread1.run();
        countUpThread2.run();
        countUpThread3.run();
    }
}
