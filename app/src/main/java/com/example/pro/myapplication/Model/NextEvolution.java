package com.example.pro.myapplication.Model;

public class NextEvolution {
    private String num;
    private String name;

    public NextEvolution(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public NextEvolution(String num) {

        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
