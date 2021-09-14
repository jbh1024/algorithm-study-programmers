package org.iptime.hoonyhoony.BruteForce.BruteForce_q1_lv1;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1SolutionTest {
    @Test
    public void BruteForce_q1_lv1_Test_1() {
        int[] answers = {1, 2, 3, 4, 5};
        Q1Solution solution = new Q1Solution();
        assertArrayEquals(new int[]{1}, solution.solution(answers));
    }

    @Test
    public void BruteForce_q1_lv1_Test_2() {
        int[] answers = {1, 3, 2, 4, 2};
        Q1Solution solution = new Q1Solution();
        assertArrayEquals(new int[]{1, 2, 3}, solution.solution(answers));
    }

}