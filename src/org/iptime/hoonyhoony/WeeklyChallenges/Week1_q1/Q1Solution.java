package org.iptime.hoonyhoony.WeeklyChallenges.Week1_q1;

public class Q1Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= (long) price * i;
        }

        return answer < 0 ? answer * -1 : 0;
    }
}