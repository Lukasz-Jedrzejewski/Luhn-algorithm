package com.jedrzejewski.Luhn.algorithm.model;

public class Coordinates {


    private double xParameter;
    private double yParameter;
    private String name;

    public Coordinates() {
    }

    public double getxParameter() {
        return xParameter;
    }

    public void setxParameter(double xParameter) {
        this.xParameter = xParameter;
    }

    public double getyParameter() {
        return yParameter;
    }

    public void setyParameter(double yParameter) {
        this.yParameter = yParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "xParameter=" + xParameter +
                ", yParameter=" + yParameter +
                ", name='" + name + '\'' +
                '}';
    }
}
