package com.jedrzejewski.Luhn.algorithm.model;

import java.util.Arrays;

public class Coordinates {

    private int quantity;
    private double[] xParameter;
    private double[] yParameter;
    private String[] name;

    public Coordinates() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double[] getxParameter() {
        return xParameter;
    }

    public void setxParameter(double[] xParameter) {
        this.xParameter = xParameter;
    }

    public double[] getyParameter() {
        return yParameter;
    }

    public void setyParameter(double[] yParameter) {
        this.yParameter = yParameter;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "quantity=" + quantity +
                ", xParameter=" + Arrays.toString(xParameter) +
                ", yParameter=" + Arrays.toString(yParameter) +
                ", name=" + Arrays.toString(name) +
                '}';
    }
}
