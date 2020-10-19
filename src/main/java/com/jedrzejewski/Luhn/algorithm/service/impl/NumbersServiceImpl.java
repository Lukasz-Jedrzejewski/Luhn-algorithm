package com.jedrzejewski.Luhn.algorithm.service.impl;

import com.jedrzejewski.Luhn.algorithm.service.NumbersService;
import org.springframework.stereotype.Service;

@Service
public class NumbersServiceImpl implements NumbersService {
    @Override
    public boolean validate(String numbers) {
        int[] digits = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            digits[i] = Integer.parseInt(numbers.substring(i, i + 1));
        }
        for (int i = digits.length -2; i >= 0; i = i -2) {
            int singleDigit = digits[i];
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
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
