package org.example;

public class Main {

    public static void main(String[] args) {
        PersonService p = new PersonService() {
            // > khi tao 1 doi tuong interface bang tu khoa new :
            // - java se tao 1 anonymous class luu trong bo nho Heap implement interface
            // - '()' bieu dien cho constructor mac dinh

            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        p.hello();
    }
}
