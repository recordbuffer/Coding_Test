package org.example.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks {
    public class MyQueue {
        // 삽입에 사용하는 스택
        Deque<Integer> input = new ArrayDeque<>();
        // 추출에 사용하는 스택
        Deque<Integer> output = new ArrayDeque<>();

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();
        }

        public int peek() {
            // 추출 스택 비어있으면 진행
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    // 역순으로 저장
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
