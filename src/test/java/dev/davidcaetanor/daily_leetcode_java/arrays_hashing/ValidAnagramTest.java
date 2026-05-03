package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    private ValidAnagram solution;

    @BeforeEach
    public void setUp() {
        solution = new ValidAnagram();
    }

    @Test
    public void testWithAnagram() {
        String s = "racecar";
        String t = "carrace";

        assertTrue(solution.execute(s, t));
    }

    @Test
    public void testWithoutAnagram() {
        String s = "jar";
        String t = "jam";

        assertFalse(solution.execute(s, t));
    }
}
