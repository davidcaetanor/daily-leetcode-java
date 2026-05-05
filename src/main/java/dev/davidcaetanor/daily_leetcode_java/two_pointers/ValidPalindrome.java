package dev.davidcaetanor.daily_leetcode_java.two_pointers;

import java.util.Arrays;

/*
Link: https://neetcode.io/problems/is-palindrome/question?list=neetcode150
 */
public class ValidPalindrome {
    public boolean execute(String s) {
        char[] charArray = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();

        char[] charAnalyse = new char[charArray.length];
        int j = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            charAnalyse[j] = charArray[i];
            j++;
        }

        return Arrays.equals(charArray, charAnalyse);
    }
}
