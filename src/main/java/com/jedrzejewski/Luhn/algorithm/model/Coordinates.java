package com.jedrzejewski.Luhn.algorithm.model;

public class Coordinates {

    private int quantity;
    private double[] xParameter;
    private double[] yParameter;
    private double[][] coordinates;

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

    public double[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[][] coordinates) {
        this.coordinates = coordinates;
    }
}
