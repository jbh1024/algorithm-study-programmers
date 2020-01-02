package org.iptime.hoonyhoony.Sort.Sort_q3_lv2;

public class Q3Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            for (int j = i + 1; j < citations.length; j++) {
                if (citations[i] < citations[j]) {
                    int temp = citations[i];
                    citations[i] = citations[j];
                    citations[j] = temp;
                }

            }
        }

        for (int i : citations) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= i) {
                return i;
            }
        }

        return citations.length;
    }
}