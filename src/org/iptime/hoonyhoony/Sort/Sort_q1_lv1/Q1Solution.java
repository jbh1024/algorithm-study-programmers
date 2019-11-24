package org.iptime.hoonyhoony.Sort.Sort_q1_lv1;

public class Q1Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //System.out.println(commands.length);
        for (int i = 0; i < commands.length; i++) {
            int[] list = new int[(commands[i][1] - commands[i][0]) + 1];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list[j - (commands[i][0] - 1)] = array[j];
                //System.out.println(j+"!!" +(commands[i][0]-1)+ " !!::test::"+array[j]);
            }
            int temp;
            for (int k = 0; k < commands[i][2]; k++) {
                for (int p = k + 1; p < list.length; p++) {
                    if (list[k] > list[p]) {
                        temp = list[p];
                        list[p] = list[k];
                        list[k] = temp;
                    }
                }
            }
            answer[i] = list[(commands[i][2] - 1)];
        }
        return answer;
    }
}
