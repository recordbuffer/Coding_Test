package org.example.stack_queue;

public class DesignCircularQueue {
    int[] q;
    int front = 0, rear = -1, len = 0;

    public DesignCircularQueue(int k) {
        this.q = new int[k];
    }

    public boolean enQueue(int value) {
        // 꽉 차있지 않다면 삽입
        if (!this.isFull()) {
            // rear 포인터 한 칸 앞으로 이동 / 최대 크기 초과시 나머지 위치로 이동
            this.rear = (this.rear +1) % this.q.length;
            this.q[rear] = value;
            this.len++;
            return true;
        } else {
            return false;
        }
    }

    public boolean deQueue() {
        // 비어 있지 않다면 삭제
        if (!this.isEmpty()) {
            // front 포인터 한 칸 앞으로 이동 / 최대 크기 초과시 나머지 위치로 이동
            this.front = (this.front +1) % this.q.length;
            this.len--;
            return true;
        } else {
            return false;
        }
    }

    public int Front() {
        // 맨 앞의 값
        return (this.isEmpty()) ? -1 : this.q[this.front];
    }

    public int Rear() {
        // 맨 뒤의 값
        return (this.isEmpty() ? -1 : this.q[this.rear]);
    }

    public boolean isEmpty() {
        // 현재 큐의 크기가 0이면 빈 것
        return this.len == 0;
    }

    public boolean isFull() {
        // 현재 큐의 크기가 전체 큐의 크기와 일치하면 꽉 찬 것
        return this.len == this.q.length;
    }
}

