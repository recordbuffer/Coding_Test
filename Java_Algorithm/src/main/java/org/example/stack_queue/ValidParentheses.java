package org.example.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[]{}()";
        System.out.println(solution(s));
    }
    private static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        // 매핑 테이블
        Map<Character, Character> table = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put('}', '{');
        }};

        for (int i = 0; i < s.length(); i++) {
            // 닫힘 괄호가 아닌 경우 스택에 푸쉬
            if (!table.containsKey(s.charAt(i))) {
               stack.push(s.charAt(i));
           // 중간에 스택이 비거나 팝 결과가 열림 괄호가 아닌 경우 유효 X
            } else if (stack.isEmpty() || table.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
