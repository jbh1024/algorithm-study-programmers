package org.iptime.hoonyhoony.Hash.Hash_q3_lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q3SolutionTest {


    @Test
    void Hash_q1_lv1_Test_1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Q3Solution solution = new Q3Solution();
        assertEquals(5, solution.solution(clothes));
    }

    @Test
    void Hash_q1_lv1_Test_2() {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Q3Solution solution = new Q3Solution();
        assertEquals(3, solution.solution(clothes));
    }

}