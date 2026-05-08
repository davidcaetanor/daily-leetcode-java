package dev.davidcaetanor.daily_leetcode_java.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private ValidParentheses solution;

    @BeforeEach
    public void setUp() {
        solution = new ValidParentheses();
    }

    @Test
    public void testTrueValidParentheses() {
        String input = "[]";

        assertTrue(solution.execute(input));
    }

    @Test
    public void testFalseValidParentheses() {
        String input = "(])(])";

        assertFalse(solution.execute(input));
    }


    @Test
    public void testThreeBracketsValidParentheses() {
        String input = "([{}])";

        assertTrue(solution.execute(input));
    }

}
