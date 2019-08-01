package com.matanmarciano.mvvmlivedata.models;

public class Model {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Model(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
