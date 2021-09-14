package org.iptime.hoonyhoony.Sort.Sort_q2_lv2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2SolutionTest {

    @Test
    public void Sort_q1_lv1_Test_1() {
        int[] numbers = {1, 5, 2, 6, 3, 7, 4};
        Q2Solution solution = new Q2Solution();
        assertEquals("7654321", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_2() {
        int[] numbers = {6, 10, 2};
        Q2Solution solution = new Q2Solution();
        assertEquals("6210", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_3() {
        int[] numbers = {3, 30, 34, 5, 9};
        Q2Solution solution = new Q2Solution();
        assertEquals("9534330", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_4() {
        int[] numbers = {12, 121};
        Q2Solution solution = new Q2Solution();
        assertEquals("12121", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_5() {
        int[] numbers = {21, 212};
        Q2Solution solution = new Q2Solution();
        assertEquals("21221", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_6() {
        int[] numbers = {998, 9, 999};
        Q2Solution solution = new Q2Solution();
        assertEquals("9999998", solution.solution(numbers));
    }

    @Test
    public void Sort_q1_lv1_Test_7() {
        int[] numbers = {0, 0, 0, 0};
        Q2Solution solution = new Q2Solution();
        assertEquals("0", solution.solution(numbers));
    }

}