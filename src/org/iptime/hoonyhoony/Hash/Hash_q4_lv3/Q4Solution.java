package org.iptime.hoonyhoony.Hash.Hash_q4_lv3;

import java.util.*;

public class Q4Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            tempMap.put(genres[i], tempMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<HashMap.Entry<String, Integer>> orderdList = new ArrayList<>(tempMap.entrySet());
        orderdList.sort((o1, o2) -> {
            int comparision = (o1.getValue() - o2.getValue()) * -1;
            return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
        });

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : orderdList) {

            List<HashMap.Entry<Integer, Integer>> genresList = new ArrayList<>();

            for (int j = 0; j < genres.length; j++) {
                if (genres[j].equals(stringIntegerEntry.getKey())) {
                    genresList.add(new AbstractMap.SimpleEntry<>(j, plays[j]));
                }
            }

            genresList.sort((o1, o2) -> {
                int comparision = o2.getValue().compareTo(o1.getValue());
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            });

            int cnt = 0;

            for (Map.Entry<Integer, Integer> map : genresList) {
                if (cnt >= 2) {
                    break;
                }
                result.add(map.getKey());
                cnt++;

            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}