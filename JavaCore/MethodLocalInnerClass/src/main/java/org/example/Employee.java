package org.example;

public class Employee {

    public void luong() {
        class Worker{
            private String ten;
            public void luong() {
                System.out.println("luong nv");
            }
        }
        // > chi co the su dung method local inner class ben trong phuong thuc

        Worker w = new Worker();
        w.luong();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.luong();
    }
}
