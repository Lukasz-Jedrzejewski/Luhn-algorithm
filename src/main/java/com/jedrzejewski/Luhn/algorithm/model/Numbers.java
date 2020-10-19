package com.jedrzejewski.Luhn.algorithm.model;

public class Numbers {

    private String numbers;

    public Numbers() {
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "numbers= " + numbers;
    }
}
