package org.example;

public class SubClass extends Kid{

    public static void main(String[] args) {
        Kid kid = new Kid();
        // > outer class co the duoc khoi tao trong class cung package thong qua ke thua
        kid.hello();
    }
}
