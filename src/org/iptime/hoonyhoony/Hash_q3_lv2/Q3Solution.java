package org.iptime.hoonyhoony.Hash_q3_lv2;

import java.util.HashMap;

public class Q3Solution {
    //TODO: 수정해야함.. 오답..
    public int solution(String[][] clothes) {
        int answer = 0;
        int tmpCount = 1;
        HashMap<String, Integer> tempMap = new HashMap();
        for ( int i = 0 ; i < clothes.length ; i++){
            tempMap.put(clothes[i][1],(tempMap.getOrDefault(clothes[i][1],0)+1));
        }
        for( String key : tempMap.keySet() ){
            answer = answer + tempMap.get(key);
            tmpCount = tmpCount*tempMap.get(key);
        }
        if (tempMap.size()  > 1){
            answer = answer+tmpCount;
        }


        return answer;
    }
}
