package dev.davidcaetanor.daily_leetcode_java.sliding_window;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBestTimeBuySellStock {
    private BestTimeBuySellStock solution;


    @BeforeEach
    public void setUP() {
        solution = new BestTimeBuySellStock();
    }

    @Test
    public void testProfitReturnSix() {
        int[] input = {10, 1, 5, 6, 7, 1};
        int expected = 6;

        assertEquals(expected, solution.execute(input));
    }

    @Test
    public void testProfitReturnZero() {
        int[] input = {7, 6, 4, 3, 1};
        int expected = 0;

        assertEquals(expected, solution.execute(input));
    }
}
