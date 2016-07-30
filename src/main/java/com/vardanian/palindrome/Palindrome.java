package com.vardanian.palindrome;

public class Palindrome {

    private boolean findPalindrome(int number) {
        String str1 = number + "";
        String str2 = new StringBuffer(number + "").reverse().toString();
        return str1.equals(str2);
    }

    public int findLargestPalindrome() {
        int TOP = 999;
        int BOTTOM = 100;
        int number1 = 999;
        int number2 = 999;
        int largestPalindrome = 0;

        while (number1 > BOTTOM) {
            int result = number1 * number2;
            if (findPalindrome(result)) {
                if (result > largestPalindrome)
                    largestPalindrome = result;
            }
            if (number2 >= BOTTOM)
                number2--;
            else {
                number1--;
                number2 = TOP;
            }
        }
        return largestPalindrome;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int largestPalindrome = palindrome.findLargestPalindrome();
        System.out.println(largestPalindrome);
    }
}