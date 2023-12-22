package org.example;

public enum EnumDemo {

    ERR("ER1","err demo"),
    ERR2("ER2","err 2 demo");

    private String code;
    private String msg;

    private EnumDemo() {
    }
    private EnumDemo(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
