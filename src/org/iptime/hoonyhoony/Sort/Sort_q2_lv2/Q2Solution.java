package org.iptime.hoonyhoony.Sort.Sort_q2_lv2;

public class Q2Solution {
    //TODO: 수정해야함.. 오답..
    public String solution(int[] numbers) {
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (compareNumbers(numbers[i], numbers[j])) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        for (int i : numbers) {
            answer += i;
        }
        return Integer.parseInt(answer) + "";

    }

    private boolean compareNumbers(int a, int b) {
        String aNum = String.valueOf(a);
        String bNum = String.valueOf(b);
        int aSum = 0, bSum = 0;
        if (aNum.length() == bNum.length()) {
            return a < b;
        } else {
            if (aNum.charAt(0) == bNum.charAt(0)) {
                for (int i = 0; i < aNum.length(); i++)
                    aSum += Character.getNumericValue(aNum.charAt(i));
                for (int i = 0; i < bNum.length(); i++)
                    bSum += Character.getNumericValue(bNum.charAt(i));
                return aSum < bSum && aNum.length() > bNum.length();
            } else {
                return aNum.charAt(0) < bNum.charAt(0);//첫자리 비교
            }
        }
    }
}
