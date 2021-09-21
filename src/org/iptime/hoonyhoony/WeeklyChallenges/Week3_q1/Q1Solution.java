package org.iptime.hoonyhoony.WeeklyChallenges.Week3_q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1Solution {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < scores.length; j++) {
            List personScore = new ArrayList<Integer>();
            int tempMax = 0, tempMin = 100;
            for (int i = 0; i < scores[j].length; i++) {
                if (tempMax <= scores[i][j])
                    tempMax = scores[i][j];
                if (tempMin >= scores[i][j])
                    tempMin = scores[i][j];
                personScore.add(scores[i][j]);
            }
            if (Collections.frequency(personScore, scores[j][j]) == 1) {
                if (tempMax == scores[j][j] | tempMin == scores[j][j]) {
                    personScore.remove(new Integer(scores[j][j]));
                }
            }
            answer.append(gerPersonCharScore(personScore));
        }
        return answer.toString();
    }

    private String gerPersonCharScore(List<Integer> personScore) {
        int average = personScore.stream().reduce(0, Integer::sum) / personScore.size();
        switch (average / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}