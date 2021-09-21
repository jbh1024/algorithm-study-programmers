package org.iptime.hoonyhoony.WeeklyChallenges.Week3_q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q1SolutionTest {

    private Q1Solution q1Solution;

    @Before
    public void beforeTest() {
        q1Solution = new Q1Solution();
    }

    @Test
    public void test1() {
        int[][] testData = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        assertEquals("FBABD", q1Solution.solution(testData));
    }

    @Test
    public void test2() {
        int[][] testData = {{50,90},{50,87}};
        assertEquals("DA", q1Solution.solution(testData));
    }

    @Test
    public void test3() {
        int[][] testData = {{70,49,90},{68,50,38},{73,31,100}};
        assertEquals("CFD", q1Solution.solution(testData));
    }
}