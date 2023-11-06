package org.example.string;

import java.util.ArrayList;
import java.util.List;

public class ReorderDataInLogFiles {
    public static void main(String[] args) {
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        reorderLogFiles(logs);
    }

    private static String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        // 구분
        for (String log: logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        // 정렬
        letterList.sort((s1, s2) -> {
            // 식별자와 나머지로 나눔
            String[] s1x = s1.split(" ",2);
            String[] s2x = s2.split(" ",2);

            /*
            compared 값이 음수인 경우 s1을 s2보다 앞에 배치
            compared 값이 양수인 경우 s2를 s1보다 앞에 배치
            */
            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });
        letterList.addAll(digitList);
        return letterList.toArray(new String[0]);
    }
}
