package org.iptime.hoonyhoony.BruteForce.BruteForce_q2_lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q2SolutionTest {
    @Test
    void BruteForce_q2_lv2_Test_1() {
        String numbers = "17";
        Q2Solution solution = new Q2Solution();
        assertEquals(3, solution.solution(numbers));
    }
    @Test
    void BruteForce_q2_lv2_Test_2() {
        String numbers = "011";
        Q2Solution solution = new Q2Solution();
        assertEquals(2, solution.solution(numbers));
    }
    @Test
    void BruteForce_q2_lv2_Test_3() {
        String numbers = "997";
        Q2Solution solution = new Q2Solution();
        assertEquals(5, solution.solution(numbers));
    }

}