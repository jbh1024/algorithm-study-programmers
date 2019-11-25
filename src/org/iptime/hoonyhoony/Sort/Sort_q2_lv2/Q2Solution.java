package org.iptime.hoonyhoony.Sort.Sort_q2_lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2Solution {
    // 답안 확인 후 수정.. Collection Sort Ramda부분 확인 해볼것..
    public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}