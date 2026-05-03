package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    public void findIndicesTargetSeven() {
        int[] input = {3, 4, 5, 6};
        int target = 7;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.getIndices(input, target));
    }

    @Test
    public void findIndicesTargetTen() {
        int[] input = {4, 5, 6};
        int target = 10;
        int[] expected = {0, 2};
        assertArrayEquals(expected, solution.getIndices(input, target));
    }

}
