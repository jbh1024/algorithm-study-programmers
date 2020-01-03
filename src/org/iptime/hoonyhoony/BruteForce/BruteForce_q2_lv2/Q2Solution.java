package org.iptime.hoonyhoony.BruteForce.BruteForce_q2_lv2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2Solution {
    static void addSet(int[] arr, int r, Set<Integer> set) {

        StringBuilder num = new StringBuilder();
        for (int i = 0; i < r; i++)
            num.append(arr[i]);
        set.add(Integer.parseInt(String.valueOf(num)));
//        return String.valueOf(num);
    }

    public int solution(String numbers) {
        //순열 알고리즘을 이용하여 가능한 경우의수를 만들고 그 수들을 소수인지 체크하는 방법으로 해결
        int answer = 0;
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        int[] ints = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            set.add(numbers.charAt(i) - '0');
            ints[i] = numbers.charAt(i) - '0';
        }

        for (int j = 1; j <= numbers.length(); j++) {
            permutation(ints, 0, j, j, set);
        }
        System.out.println(set);
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            int k = itr.next();
            if (checkPrimeNum(k)) {
                answer++;
            }
        }

        return answer;
    }

    private void permutation(int[] arr, int depth, int n, int r, Set<Integer> set) {
        if (depth == r) {
            addSet(arr, r, set);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, set);
            swap(arr, depth, i);
        }
    }

    private void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    private boolean checkPrimeNum(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            //3부터 자신보다 작은 수가 나올때까지 나누어서 나누어지면 소수가 아님.
            for (int i = 3; i < num; i++) {

                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}