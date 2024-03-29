package org.iptime.hoonyhoony.BruteForce.BruteForce_q2_lv2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2SolutionTest {
    @Test
    public void BruteForce_q2_lv2_Test_1() {
        String numbers = "17";
        Q2Solution solution = new Q2Solution();
        assertEquals(3, solution.solution(numbers));
    }
    @Test
    public void BruteForce_q2_lv2_Test_2() {
        String numbers = "011";
        Q2Solution solution = new Q2Solution();
        assertEquals(2, solution.solution(numbers));
    }
    @Test
    public void BruteForce_q2_lv2_Test_3() {
        String numbers = "997";
        Q2Solution solution = new Q2Solution();
        assertEquals(5, solution.solution(numbers));
    }

}