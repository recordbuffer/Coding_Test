package org.example.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public class MyStack {
        // 큐는 LinkedList로 선언
        Queue<Integer> queue = new LinkedList<>();

        public void push(int x) {
            queue.add(x);
            // 재정렬 => 스택은 push되면 밑에서 부터 위로 쌓임
            for (int i = 1; i < queue.size(); i++) {
                queue.add(queue.remove());
            }
        }
        public int pop() {
            return queue.remove();
        }
        public int top() {
            return queue.peek();
        }
        public boolean empty() {
            return queue.size() == 0;
        }
    }
}
