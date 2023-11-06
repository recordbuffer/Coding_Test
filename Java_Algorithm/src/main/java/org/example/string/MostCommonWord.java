package org.example.string;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String words = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] ban = {"hit"};

        System.out.println(mostCommonWord(words, ban));
    }
    private static String mostCommonWord(String paragraph, String[] ban) {
        Set<String> banSet = new HashSet<>(Arrays.asList(ban));
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        // 단어별 개수 저장
        Map<String, Integer> cnt = new HashMap<>();

        for(String w : words) {
            if (!banSet.contains(w)) {
                /*
                getOrDefault
                키가 이미 존재할 경우 > 그 키의 값을 반환함 + 1
                키가 존재하지 않는 경우 > 그대로 0 반환 + 1
                */
                cnt.put(w, cnt.getOrDefault(w, 0) + 1);
            }
        }
        return Collections.max(cnt.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
