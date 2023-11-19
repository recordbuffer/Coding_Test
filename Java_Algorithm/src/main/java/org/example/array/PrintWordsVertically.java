package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        String str = "HEY CUTTIE PIE";
        System.out.println(solution(str).toString());
    }

    private static List<String> solution(String str) {
        String[] words = str.split(" ");

        // 제일 긴 단어의 길이 추출
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        List<String> res = new ArrayList<>();
        // 제일 긴 단어의 길이만큼 단어 생성
        for (int i = 0; i < longest.length(); i++) {
            String s = "", space = "";
            // 총 단어 갯수만큼
            for (int j = 0; j < words.length; j++) {
                if (i >= words[j].length()) {
                    space += " ";
                } else {
                    s += space + words[j].charAt(i);
                    space = "";
                }
            }
            res.add(s);
        }
        return res;
    }
}
