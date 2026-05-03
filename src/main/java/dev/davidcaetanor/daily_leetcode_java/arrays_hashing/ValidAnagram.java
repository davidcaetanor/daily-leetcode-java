package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toLowerCase().toCharArray();
        char[] t2 = t.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t2);

        return Arrays.equals(s1, t2);
    }
}
