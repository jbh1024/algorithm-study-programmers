package org.iptime.hoonyhoony.BruteForce.BruteForce_q1_lv1;

public class Q1Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] aAnswer = {1, 2, 3, 4, 5};
        int[] bAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] counts = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == aAnswer[(i % 5)]) {
                counts[0]++;
            }

            if (answers[i] == bAnswer[(i % 8)]) {
                counts[1]++;
            }
            if (answers[i] == cAnswer[(i % 10)]) {
                counts[2]++;
            }
        }

        if (counts[0] > counts[1]) {
            if (counts[0] > counts[2]) {
                answer = new int[1];
                answer[0] = 1;
            } else if (counts[0] < counts[2]) {
                answer = new int[1];
                answer[0] = 3;
            } else {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 3;
            }
        } else if (counts[0] < counts[1]) {
            if (counts[1] > counts[2]) {
                answer = new int[1];
                answer[0] = 2;
            } else if (counts[1] < counts[2]) {
                answer = new int[1];
                answer[0] = 3;
            } else {
                answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            }
        } else {
            if (counts[0] > counts[2]) {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 2;
            } else if (counts[0] < counts[2]) {
                answer = new int[1];
                answer[0] = 3;
            } else {
                answer = new int[3];
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;
            }

        }

        return answer;
    }
}