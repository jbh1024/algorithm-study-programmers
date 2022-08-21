package org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2SolutionTest {

    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_1() {
        String newId = "..!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }

    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_2() {
        String newId = "z-+.^.";
        String result = "z--";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }
    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_3() {
        String newId = "=.=";
        String result = "aaa";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }
    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_4() {
        String newId = "123_.def";  	   
        String result = "123_.def";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }
    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_5() {
        String newId = "abcdefghijklmn.p"; 
        String result = "abcdefghijklmn";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }

    @Test
    public void KakaoBlindRecruitment_q2_lv1_Test_6() {
        String newId = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        Q2Solution solution = new Q2Solution();
        assertEquals(result, solution.solution(newId));
    }

}
