package org.example;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(super.getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        // Khi tao Thread bang cach extend Thread
        // > khi new 1 thread va thuc hien run se tao ra 1 doi tuong thread chay doc lap
        // co the su dung extends thread de thuc hien cac tasks vu song song doc lap cung luc dong thoi nham tang toc do xu ly

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
