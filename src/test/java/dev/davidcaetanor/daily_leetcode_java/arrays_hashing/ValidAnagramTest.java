package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    ValidAnagram solution = new ValidAnagram();

    @Test
    public void testWithAnagram() {
        String s = "racecar";
        String t = "carrace";

        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testWithoutAnagram() {
        String s = "jar";
        String t = "jam";

        assertFalse(solution.isAnagram(s, t));
    }
}
