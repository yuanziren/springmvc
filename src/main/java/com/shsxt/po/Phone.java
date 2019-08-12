package com.shsxt.po;


public class Phone {

    private Integer num;


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "num=" + num +
                '}';
    }
}
