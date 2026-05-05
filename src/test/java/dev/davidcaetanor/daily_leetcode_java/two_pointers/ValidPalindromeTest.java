package dev.davidcaetanor.daily_leetcode_java.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    private ValidPalindrome solution;

    @BeforeEach
    public void setUp() {
        solution = new ValidPalindrome();
    }

    @Test
    public void testTrueValidPalindrome() {
        String input = "Was it a car or a cat I saw?";

        assertTrue(solution.execute(input));
    }

    @Test
    public void testFalseValidPalindrome() {
        String input = "tab a cat";

        assertFalse(solution.execute(input));
    }

}
