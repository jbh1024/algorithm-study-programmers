package org.iptime.hoonyhoony.Hash.Hash_q4_lv3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q4SolutionTest {
    @Test
    void Hash_q2_lv2_Test_1() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Q4Solution solution = new Q4Solution();
        assertArrayEquals(new int[]{4, 1, 3, 0}, solution.solution(genres, plays));
    }


}