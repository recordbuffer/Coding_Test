package org.example.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "dbacdcbc";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        Map<Character, Boolean> seen = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            counter.put(c, counter.get(c) == null ? 1 : counter.get(c) + 1);
        }

        for (char c : s.toCharArray()) {
            // 현재 처리하는 문자는 카운터에서 -1 처리
            counter.put(c, counter.get(c) -1);
            // 이미 처리한 문자는 건너뛰기
            if (seen.get(c) != null && seen.get(c) == true)
                continue;
            // 스택에 있는 문자가 현재 문자보다 더 뒤에 붙여야할 문자라면 스택에서 제거 후 처리 하지 않은 것으로 표시
            while (!stack.isEmpty() && stack.peek() > c && counter.get(stack.peek()) > 0)
                seen.put(stack.pop(), false);
            stack.push(c);
            seen.put(c, true);
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty())
            sb.append(stack.pollLast());

        return sb.toString();
    }
}
