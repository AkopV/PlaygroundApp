package com.vardanian.factorial;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FindSumFactorialNumbersTest {

    private FindSumFactorialNumbers findSumFactorialNumbers;

    @BeforeTest
    public void setUp() {
        findSumFactorialNumbers = new FindSumFactorialNumbers();
    }

    @Test
    public void testSum() {
        long sum =  findSumFactorialNumbers.sum(BigInteger.valueOf(3647));
        Assert.assertEquals(20, sum);
    }
}
