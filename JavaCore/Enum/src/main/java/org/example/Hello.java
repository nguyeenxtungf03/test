package org.example;

public class Hello {

    public static void main(String[] args) {
        EnumDemo.ERR.setMsg("s");
        System.out.println(EnumDemo.ERR.getMsg());
    }
}
