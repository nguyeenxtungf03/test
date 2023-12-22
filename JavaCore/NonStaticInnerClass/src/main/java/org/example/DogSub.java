package org.example;

public class DogSub {

    public static void main(String[] args) {
        Animal an = new Animal();

        Animal.Dog d = an.new Dog();
// > tuy thuoc vao quan ly truy cap
        d.hello();
    }
}

// > khong the ke thua inner class o ngoai class, chi co the ke thua trong cung class
