package org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Q1Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> reportCountList = new HashMap<>(); //신고 당한 리스트
        List<String> reportDistinctList = Arrays.stream(report).distinct().peek(s -> checkReport(reportCountList, s)).collect(Collectors.toList());

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = reportDistinctList.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> reportCountList.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

    private void checkReport(HashMap<String, Integer> reportList, String reportInfo) {
        String tempId = reportInfo.split(" ")[1];
        reportList.put(tempId, reportList.getOrDefault(tempId, 0) + 1);
    }

    public int[] solution2(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> cnt = new HashMap<>();
        HashMap<String, Integer> idx = new HashMap<>();
        Arrays.sort(report);
        String before = "";

        for (int i = 0; i < id_list.length; i++) {
            cnt.put(id_list[i], 0);
            idx.put(id_list[i], i);
        }
        for (String r : report) {
            if (before.equals(r)) continue;
            before = r;
            String[] re = r.split(" ");
            cnt.put(re[1], cnt.get(re[1]) + 1);
        }
        before = "";
        for (String r : report) {
            if (before.equals(r)) continue;
            before = r;
            String[] re = r.split(" ");
            if (cnt.get(re[1]) >= k) answer[idx.get(re[0])] += 1;
        }
        return answer;
    }
}

