package org.iptime.hoonyhoony.Hash.Hash_q1_lv1;

import java.util.HashMap;

public class Q1Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> tempMap = new HashMap();
        //조건에서 항상 크기차이가 1이기때문에 마지막 루프에서만 분기로 걸러주고 체크함.
        for(int i = 0 ; i < participant.length ; i ++){
            tempMap.put(participant[i],tempMap.getOrDefault(participant[i],0)+1);
            if(i < completion.length)
                tempMap.put(completion[i],tempMap.getOrDefault(completion[i],0)-1);
        }
        for(String key : tempMap.keySet()){ //완주못한 1인 체크용
            if(tempMap.get(key) != 0)
                answer = key;
        }
        System.out.println(answer);
        return answer;
    }
}
