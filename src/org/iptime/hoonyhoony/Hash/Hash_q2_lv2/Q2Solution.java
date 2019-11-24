package org.iptime.hoonyhoony.Hash.Hash_q2_lv2;

public class Q2Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int i = 0;
        while(answer&& i < phone_book.length){
            for (int j = i+1; j< phone_book.length; j++){
                if (phone_book[j].startsWith(phone_book[i])){
                    answer = false;
                    break;
                }else if (phone_book[i].startsWith(phone_book[j])){
                    answer = false;
                    break;
                }
            }
            i++;
        }
        return answer;
    }
}
