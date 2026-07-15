package org.example.string.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // 1. 문자열과 문자를 받아 문자열에 해당 문자가 몇개 있는지 세서 리턴
//        System.out.println(string01("Computercooler", 'c'));
    // 2. 대소문자 같이 있는 문자열 입력받아 대>소 / 소>대 로 바꿔서 리턴
//        System.out.println(string02("StuDY"));
    // 3. 문장 받아 그 중 가장 긴 단어 리턴
//        System.out.println(string03("it is time to study"));
    // 4. N개의 단어가 주어지면 각 단어를 뒤집어 리턴
//        String[] str = new String[]{"good", "Time", "Big"};
//        System.out.println(string04(3, str).toString());
    // 5. 문자열을 받는데 특수문자는 자리에 두고 알파벳은 위치를 바꾸어 리턴
        System.out.println(string05("a#b!GE*T@S"));
    }

    // 1. 문자 찾기
    private static int string01(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        for (char t : str.toCharArray()) {
            if (t==c) answer++;
        }
        return answer;
    }

    // 2. 대소문자 변환
    private static String string02(String str) {
        String answer = "";
        for (char t : str.toCharArray()) {
            if (Character.isLowerCase(t)) {
                answer+=Character.toUpperCase(t);
            } else {
                answer+=Character.toLowerCase(t);
            }
        }
        return answer;
    }

    // 3. 문장 속 단어
    private static String string03(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE, pos;
        // 띄어쓰기를 발견하면 인덱스 번호를 리턴
        while ((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > min) {
                min=len;
                answer=tmp;
            }
            // 문장을 띄어쓰기 이후로 자름
            str=str.substring(pos+1);
        }
        // 마지막 단어는 while문을 못타니 처리 해줘야
        if (str.length()>min) answer=str;
        return answer;
    }

    // 4. 단어 뒤집기
    private static List<String> string04(int n, String[] str) {
        List<String> res = new ArrayList<>();
        for (String x : str) {
            res.add(new StringBuilder(x).reverse().toString());
        }
        return res;
    }

    // 5. 특정 문자 뒤집기
    private static String string05(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt=0, rt=str.length()-1;
        while (lt<rt) {
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer=String.valueOf(c);
        }
        return answer;
    }
}
