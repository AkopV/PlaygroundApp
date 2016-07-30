package com.vardanian.palindrome;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PalindromeTest {

    Palindrome palindrome;

    @BeforeTest
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void findLargestPalindromeTest() {
        int check = palindrome.findLargestPalindrome();
        assertEquals(906609, check);
    }
}
