package org.example;

public class TestThread extends Thread{

    private String threadName;

    public TestThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i ++) {
            System.out.println(this.getThreadName() + " " + i);
        }
    }

    public static void main(String[] args) {
        TestThread testThread1 = new TestThread("a");
        TestThread testThread2 = new TestThread("b");
        testThread1.start();
        testThread2.start();
    }
}
