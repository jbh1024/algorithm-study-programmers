package org.iptime.hoonyhoony.WeeklyChallenges.Week1_q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q1SolutionTest {
    Q1Solution q1Solution;

    @Before
    public void testBefore(){
        q1Solution = new Q1Solution();
    }

    @Test
    public void test1(){
        int price = 3;
        int money = 20;
        int count = 4;
        int expectResult = 10;
        assertEquals(q1Solution.solution(price,money,count), 10);
    }

}