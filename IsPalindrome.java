package com.java.GrokkingInterviewPatterns;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {
    public void isPalindrome(String word) {
        String[] strArray = word.split("");
        List<String> str = new ArrayList<>(Arrays.asList(strArray));

        String leftPointer = str.get(0);
        String rightPointer = str.get(str.size() - 1);

        
    }
}
