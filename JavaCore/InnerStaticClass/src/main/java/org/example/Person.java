package org.example;

public class Person {

    //inner static class
    public static class Kid {
        private int tuoi;
// > trong inner static class co the khai bao cac thuoc tinh va phuong thuc
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
// > co the su dung cac thuoc tinh va phuong thuc cua ISC thong qua viec khoi tao
        kid.hello();
    }
}
