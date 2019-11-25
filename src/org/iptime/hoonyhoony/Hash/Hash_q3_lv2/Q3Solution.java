package org.iptime.hoonyhoony.Hash.Hash_q3_lv2;

import java.util.HashMap;

public class Q3Solution {
    //수정 완료,  의상의 종류가 A(가지), B(가지), C(가지) 3종류일 때
    // 총 조합 수 = A + B + C + AB + AC + BC + ABC = (A+1)(B+1)(C+1) - 1 전개...
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> tempMap = new HashMap();
        for (int i = 0; i < clothes.length; i++) {
            tempMap.put(clothes[i][1], (tempMap.getOrDefault(clothes[i][1], 1) + 1));
        }
        for (String key : tempMap.keySet()) {
            answer = answer * tempMap.get(key);
        }
        return answer - 1;
    }
}