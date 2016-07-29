package com.vardanian.palindrome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void findPalindromeTest() {
        boolean check = palindrome.findPalindrome(906609);
        Assert.assertEquals(true, check);
    }

    @Test
    public void findLargestPalindromeTest() {
        Assert.assertEquals(906609, palindrome.findLargestPalindrome());
    }
}
