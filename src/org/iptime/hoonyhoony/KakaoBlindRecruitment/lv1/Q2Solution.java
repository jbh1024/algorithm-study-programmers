package org.iptime.hoonyhoony.KakaoBlindRecruitment.lv1;

public class Q2Solution {
    public String solution(String new_id) {
        String result = step1_idToLowerCase(new_id);
        result = step2_invalidCharacterCheck(result);
        result = step3_doubleCommaCheck(result);
        result = step4_startEndCommaCheck(result);
        result = step5_idEmptyCheck(result);
        result = step6_idMaxLengthCheck(result);
        result = step7_idMinLengthCheck(result);
        return result;
    }

    //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    private String step1_idToLowerCase(String id) {
        return id.toLowerCase();
    }

    //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    private String step2_invalidCharacterCheck(String id) {
        String match = "[^0-9a-z\\-_.]";
        return id.replaceAll(match, "");
    }

    //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    private String step3_doubleCommaCheck(String id) {
        return id.replaceAll("\\.{2,}", ".");
    }

    //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    private String step4_startEndCommaCheck(String id) {
        if (!id.isEmpty() && id.charAt(0) == '.') {
            id = id.substring(1);
        }
        if (!id.isEmpty() && id.charAt(id.length() - 1) == '.') {
            id = id.substring(0, id.length() - 1);
        }
        return id;
    }

    //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    private String step5_idEmptyCheck(String result) {
        if (result.isEmpty()) { // 5
            result = "a";
        }
        return result;
    }

    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    private String step6_idMaxLengthCheck(String result) {
        int ID_LENGTH_MAX = 15;
        if (result.length() > ID_LENGTH_MAX) { //6
            result = result.substring(0, ID_LENGTH_MAX);
            if (result.charAt(result.length() - 1) == '.') { // 4
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    private String step7_idMinLengthCheck(String result) {
        int ID_LENGTH_MIN = 3;
        if (result.length() < ID_LENGTH_MIN) { // 7
            StringBuilder text = new StringBuilder(result);
            while (text.length() < ID_LENGTH_MIN) {
                text.append(result.charAt(result.length() - 1));
            }
            result = text.toString();
        }
        return result;
    }
}
