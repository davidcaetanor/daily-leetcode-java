package dev.davidcaetanor.daily_leetcode_java.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch solution;

    @BeforeEach
    public void setUp() {
        solution = new BinarySearch();
    }

    @Test
    public void testBinarySearchReturnThree() {
        int[] input = {-1, 0, 2, 4, 6, 8};
        int target = 4;
        int expected = 3;

        assertEquals(expected, solution.execute(input, target));
    }

    @Test
    public void testBinarySearchWithoutResult() {
        int[] input = {-1, 0, 2, 4, 6, 8};
        int target = 3;
        int expected = -1;

        assertEquals(expected, solution.execute(input, target));
    }
    
}
