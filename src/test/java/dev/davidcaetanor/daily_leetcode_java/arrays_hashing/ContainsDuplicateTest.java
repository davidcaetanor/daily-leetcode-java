package dev.davidcaetanor.daily_leetcode_java.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    ContainsDuplicate solution = new ContainsDuplicate();


    @Test
    public void testArrayWithDuplicate(){
        int[] nums = {1,2,3,3};

        //Espera retorno 'true', indicando que há duplicata
        assertTrue(solution.hasDuplicate(nums));
    }

    @Test
    public void testArrayWithoutDuplicate(){
        int[] nums = {1,2,3,4};

        //Espera retorno 'false', indicando que não há duplicata
        assertFalse(solution.hasDuplicate(nums));
    }
    
}
