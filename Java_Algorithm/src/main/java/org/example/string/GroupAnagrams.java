package org.example.string;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "ant", "cat"};
        System.out.println(groupAnagrams(words));
    }

    private static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> res = new HashMap<>();

        for (String w : words) {
            // 문자열 > 문자배열
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            // 문자 배열을 키로 하기 위해 다시 문자열로 변환
            String key = String.valueOf(chars);

            // 기존에 없던 키면 빈 리스트 삽입
            if (!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(w);
        }
        return new ArrayList<>(res.values());
    }

}
