package org.iptime.hoonyhoony.Sort.Sort_q1_lv1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1SolutionTest {

    @Test
    public void Sort_q1_lv1_Test_1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Q1Solution solution = new Q1Solution();
        assertArrayEquals(new int[]{5, 6, 3}, solution.solution(array, commands));
    }

//    @Test
//    void Sort_q1_lv1_Test_2() {
//        int[] array = {};
//        int[][] commands  = {};
//        Q1Solution solution = new Q1Solution();
//        assertArrayEquals(new int[]{5, 6, 3}, solution.solution(array, commands));
//    }
//
}