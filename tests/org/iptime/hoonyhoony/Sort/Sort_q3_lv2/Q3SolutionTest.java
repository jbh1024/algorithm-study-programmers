package org.iptime.hoonyhoony.Sort.Sort_q3_lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q3SolutionTest {

    @Test
    void Hash_q3_lv2_Test_1() {
        int[] citations = {3, 0, 6, 1, 5};
        Q3Solution solution = new Q3Solution();
        assertEquals(3, solution.solution(citations));
    }

    @Test
    void Hash_q3_lv2_Test_2() {
        int[] citations = {22, 19, 20, 1, 2};
        Q3Solution solution = new Q3Solution();
        assertEquals(3, solution.solution(citations));
    }

    @Test
    void Hash_q3_lv2_Test_3() {
        int[] citations = {22, 42};
        Q3Solution solution = new Q3Solution();
        assertEquals(2, solution.solution(citations));
    }

}