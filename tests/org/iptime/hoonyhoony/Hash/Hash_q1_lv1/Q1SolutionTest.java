package org.iptime.hoonyhoony.Hash.Hash_q1_lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1SolutionTest {

    @Test
    void Hash_q1_lv1_Test_1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Q1Solution solution = new Q1Solution();
        assertEquals("leo", solution.solution(participant, completion));
    }

    @Test
    void Hash_q1_lv1_Test_2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        Q1Solution solution = new Q1Solution();
        assertEquals("vinko", solution.solution(participant, completion));
    }

    @Test
    void Hash_q1_lv1_Test_3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Q1Solution solution = new Q1Solution();
        assertEquals("mislav", solution.solution(participant, completion));
    }
}