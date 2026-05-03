package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    private ContainsDuplicate solution;

    @BeforeEach
    public void setUp() {
        solution = new ContainsDuplicate();
    }

    @Test
    public void testArrayWithDuplicate() {
        int[] nums = {1, 2, 3, 3};

        assertTrue(solution.execute(nums));
    }

    @Test
    public void testArrayWithoutDuplicate() {
        int[] nums = {1, 2, 3, 4};

        assertFalse(solution.execute(nums));
    }

}
