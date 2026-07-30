package com.java.GrokkingInterviewPatterns;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {

    public List<String> removeSpaces(String word) {
        String[] array = word.split("");
        List<String> sentence = new ArrayList<>(Arrays.asList(array));

        for (String c : sentence) {
            if (c.equals(" ")) {
                sentence.remove(sentence.indexOf(c));
            }
        }
        return sentence;
    }

    
    public boolean isPalindrome(String word) {
        String[] strArray = word.split("");
        List<String> str = new ArrayList<>(Arrays.asList(strArray));

        String leftPointer = str.get(0);
        String rightPointer = str.get(str.size() - 1);
        int leftCurrentIndex = 0;
        int rightCurrentIndex = str.size() - 1;

        while (leftPointer.equals(rightPointer)) {
            if (leftCurrentIndex == str.size() - 1 && rightCurrentIndex == 0) {
                return true;
            }
            leftCurrentIndex++;
            rightCurrentIndex--;

            leftPointer = str.get(leftCurrentIndex);
            rightPointer = str.get(rightCurrentIndex);
        }
        return false;

    }
}
