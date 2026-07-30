package com.java.GrokkingInterviewPatterns;

public class Tester {
    public static void main(String[] args) {
        IsPalindrome palindromeObj = new IsPalindrome();
        boolean isPalindrome = palindromeObj.isPalindrome("was it a car or a cat i saw");
        System.out.println(isPalindrome);
    }
}
