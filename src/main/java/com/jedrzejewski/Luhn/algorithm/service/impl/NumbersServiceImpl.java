package com.jedrzejewski.Luhn.algorithm.service.impl;

import com.jedrzejewski.Luhn.algorithm.service.NumbersService;
import org.springframework.stereotype.Service;

@Service
public class NumbersServiceImpl implements NumbersService {
    @Override
    public boolean validate(String numbers) {
        if (luhnAlgorithm(numbers) % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getACheckDigit(String numbers) {
        if (luhnAlgorithm(numbers) % 10 > 0) {
            return 10 - luhnAlgorithm(numbers) % 10;
        }
        return luhnAlgorithm(numbers) % 10;
    }

    @Override
    public int luhnAlgorithm(String numbers) {
        String regex = "([0-9+-]*\\)*\\(*\\s*)+";
        String numbersWithoutSpaces = numbers.replaceAll("\\s+", "");
        int[] digits = new int[numbersWithoutSpaces.length()];
        for (int i = 0; i < numbersWithoutSpaces.length(); i++) {
            digits[i] = Integer.parseInt(numbersWithoutSpaces.substring(i, i + 1));
        }
        for (int i = digits.length -2; i >= 0; i = i -2) {
            int singleDigit = digits[i];
            System.out.println(singleDigit);
            singleDigit = singleDigit* 2;
            if (singleDigit > 9) {
                singleDigit = singleDigit % 10 + 1;
            }
            digits[i] = singleDigit;
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum+= digits[i];
        }
        return sum;
    }

    @Override
    public boolean checkDigits(String numbers) {
        String regex = "([0-9+-]*\\)*\\(*\\s*)+";
        numbers.replaceAll("\\s+", "");
        if (numbers.matches(regex)) {
            return true;
        }
        return false;
    }
}
