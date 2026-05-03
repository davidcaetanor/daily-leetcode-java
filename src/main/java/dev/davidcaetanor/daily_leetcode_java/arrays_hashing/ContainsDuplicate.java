package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import java.util.HashMap;

/*
Link: https://neetcode.io/problems/duplicate-integer/question?list=neetcode150
 */
public class ContainsDuplicate {
    public boolean execute(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
