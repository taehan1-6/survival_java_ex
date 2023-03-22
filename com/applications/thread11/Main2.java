package com.applications.thread11;

class Counter2 {
    int num = 0;
}

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter2 = new Counter2();
        for (int i = 0; i < 100000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    
                    synchronized (counter2) {
                        counter2.num++;
                        System.out.println(counter2.num);
                    }
                    
//                    
//                    counter2.num++;
//                    System.out.println(counter2.num);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }).start();
        }
        
        
//        Thread.sleep(5000);
        System.out.println("결과: " + counter2.num);
    }
}
