package com.jedrzejewski.Luhn.algorithm.service;

public interface NumbersService {

    boolean validate(String numbers);
    int getACheckDigit(String numbers);
    int luhnAlgorithm(String numbers);
    boolean checkDigits(String numbers);
}
