package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    private TwoSum solution;

    @BeforeEach
    public void setUp() {
        solution = new TwoSum();
    }

    @Test
    public void findIndicesTargetSeven() {
        int[] input = {3, 4, 5, 6};
        int target = 7;
        int[] expected = {0, 1};

        assertArrayEquals(expected, solution.execute(input, target));
    }

    @Test
    public void findIndicesTargetTen() {
        int[] input = {4, 5, 6};
        int target = 10;
        int[] expected = {0, 2};

        assertArrayEquals(expected, solution.execute(input, target));
    }

}
