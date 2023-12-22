package org.example;

public class Animal {

    //inner class
    public class Dog {
        private String ten;

        public void hello() {
            System.out.println("hello");
        }
    }

    public class Husky extends Dog {
// > co the ke thua inner class ngay trong cung 1 class
    }

    public static void main(String[] args) {
        Animal an = new Animal();
// > cach su dung inner class : khai bao va su dung nhu 1 bien instance cua class
        Animal.Dog d = an.new Dog();

        d.hello();
    }
}
