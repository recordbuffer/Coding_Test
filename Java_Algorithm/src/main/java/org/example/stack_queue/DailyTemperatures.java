package org.example.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public static void main(String[] args) {
        int [] temperatures = new int[] {23, 24, 25, 21, 19, 22, 26, 23};
        System.out.println(solution(temperatures).toString());
    }

    private static int[] solution(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            // 현재 온도가 스택 온도보다 높으면 꺼내서 결과 업데이트
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int last = stack.pop();
                res[last] = i - last;
            }
            stack.push(i);
        }
        return res;
    }
}
