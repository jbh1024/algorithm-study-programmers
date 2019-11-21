package org.iptime.hoonyhoony.Hash_q2_lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2SolutionTest {

    @Test
    void Hash_q2_lv2_Test_1() {
        String[] phone_book	 = {"119", "97674223", "1195524421"};
        Q2Solution solution = new Q2Solution();
        assertFalse(solution.solution(phone_book));
    }

    @Test
    void Hash_q2_lv2_Test_2() {
        String[] phone_book	= {"123","456","789"};
        Q2Solution solution = new Q2Solution();
        assertTrue(solution.solution(phone_book));
    }

    @Test
    void Hash_q2_lv2_Test_3() {
        String[] phone_book	= {"12","123","1235","567","88"};
        Q2Solution solution = new Q2Solution();
        assertFalse(solution.solution(phone_book));
    }

}