package demo;

public class MyThread2 implements Runnable {

    private int balance = 1000;

    @Override
    public void run() {
        try {
            withdraw();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void withdraw() throws InterruptedException {
        balance = balance - 1000;
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
        if (balance < 0) {
            System.out.println("het tien");
        } else {
            System.out.println("ok");
        }
    }
}
