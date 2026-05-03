package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import java.util.HashMap;
import java.util.Map;
/*
Link: https://neetcode.io/problems/two-integer-sum/question?list=neetcode150
 */
public class TwoSum {
    public int[] getIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int lenArray = nums.length;

        for (int i = 0; i < lenArray; i++) {
            int numComplement = target - nums[i];

            if (map.containsKey(numComplement)) {
                return new int[]{map.get(numComplement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
