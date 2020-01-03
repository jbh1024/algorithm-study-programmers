package org.iptime.hoonyhoony.BruteForce.BruteForce_q2_lv2;

import java.util.HashSet;

public class Q2Solution {
    public int solution(String numbers) {
        int answer = 0;
        //순열 메소드가 잘못되어 전체 수정...
        String[] num_arr = numbers.split("");
        HashSet<Integer> checked = new HashSet<>();

        for (int i = 0; i < num_arr.length; i++) {
            answer += permutation(num_arr, checked, "", 0, i + 1);
        }
        System.out.println("correct" + checked);
        return answer;
    }

    /* 숫자 조합을 생성 후 존재하는경우 0 존재하지않는 경우 1 리턴 */
    private int permutation(String[] arr, HashSet<Integer> checked, String numString, int visited, int toPick) {

        if (toPick == 0) {
            int num = Integer.parseInt(numString);

            //중복검사
            if (checked.contains(num)) return 0;
            checked.add(num);
            //소수 판별
            if (checkPrimeNum(num)) return 1;
            return 0;
        }

        int ret = 0;

        //자기자신을 중복선택하지 않는 순열 생성 (visitied 사용여부에 따라)
        for (int i = 0; i < arr.length; i++) {
            if ((visited & (1 << i)) > 0)
                continue;
            ret += permutation(arr, checked, numString + arr[i], visited + (1 << i), toPick - 1);
        }

        return ret;
    }

    /* 소수 체크 */
    private boolean checkPrimeNum(int num) {

        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            //2를 제외한 모든 짝수는 소수가 아님
            return false;
        } else {
            int sqrtn = (int) Math.sqrt(num);
            for (int i = 3; i < sqrtn; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
