package com.vardanian.factorial;

import java.math.BigInteger;

public class FindSumFactorialNumbers {

    //The first variant is find sum of factorial numbers without use BigInteger
    public static final int MAX = 500;

    static int sumFactorial(int number) {
        int []arrayResult = new int[MAX];
        int result = 0;

        arrayResult[0] = 1;
        int value = 1;

        for (int x = 2; x <= number; x++) {
            value = multiply(x, arrayResult, value);
        }
        for (int i = value - 1; i >= 0; i--) {
            result += Integer.parseInt("" + arrayResult[i]);
        }
        return result;

    }

    static int multiply(int x, int arrayResult[], int value) {
        int nextValue = 0;
        for (int i = 0; i < value; i++) {
            int lastNumber = arrayResult[i] * x + nextValue;
            arrayResult[i] = lastNumber % 10;
            nextValue = lastNumber / 10;
        }
        while (nextValue > 0) {
            arrayResult[value] = nextValue % 10;
            nextValue = nextValue / 10;
            value++;
        }
        return value;
    }

    /**
     * It find the factorial number
     * according to algorithm  n! = n × (n − 1) × ... × 3 × 2 × 1
     * @param number type BigInteger
     */
    public BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.valueOf(1)) == 0) {
            return number;
        } else {
            BigInteger fact = factorial(number.subtract(BigInteger.valueOf(1)));
            return number.multiply(fact);
        }
    }

    /**
     * It calculates the sum of the numbers from 1 to n inclusive.
     *
     * @param num limit
     * @return sum
     */
    public long sum(BigInteger num) {
        String digits = num.toString();
        long sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt("" + digits.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of digits in factorial of 100 without use BigInteger is: " + sumFactorial(100));
        FindSumFactorialNumbers findSumFactorialNumbers = new FindSumFactorialNumbers();
        long sumFactorialNumber = (findSumFactorialNumbers.sum(findSumFactorialNumbers.factorial(BigInteger.valueOf(100))));
        System.out.println("The sum of digits in factorial of 100 is: " + sumFactorialNumber);
    }
}

