package org.example;

import demo.MyThread2;

public class Main {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        Thread t2 = new Thread(myThread2);
        Thread t3 = new Thread(myThread2);

        // Khi su dung implements Runnable
        // > khi new thread se tao ra 1 thread

        t1.start();
        t2.start();
        t3.start();
    }
}