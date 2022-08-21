package org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1SolutionTest {

    @Test
    public void KakaoBlindRecruitment_q1_lv1_Test_1() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1.Q1Solution solution = new Q1Solution();
        assertArrayEquals(new int[]{2,1,1,0}, solution.solution(id_list, report, k));
    }

    @Test
    public void KakaoBlindRecruitment_q1_lv1_Test_2() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1.Q1Solution solution = new Q1Solution();
        assertArrayEquals(new int[]{0,0}, solution.solution(id_list, report, k));
    }

}