package com.cnc.personal.netty.entity;

/**
 * @program: netty
 * @description
 * @author: cys2222
 * @create: 2021-01-25 19:43
 **/
public class Phone {

    public static final int phone_no = 111;

    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
