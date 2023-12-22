package org.example;

public class Person {

    public void xinChao() {
        Kid kid = new Kid();
// > outer class co the duoc khoi tao trong class
        kid.hello();
    }

}

//outer calss
class Kid {
    private int tuoi;

    public void hello() {
        System.out.println("xin chao");
    }
}