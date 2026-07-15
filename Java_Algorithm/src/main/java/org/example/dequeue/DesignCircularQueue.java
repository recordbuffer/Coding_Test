package org.example.dequeue;

public class DesignCircularQueue {
    static class DoublyLinkedList {
        DoublyLinkedList left;
        DoublyLinkedList right;

        int val;

        public DoublyLinkedList(int val) {
            this.val = val;
        }
    }

    int len;    // 현재 큐의 크기
    int k;      // 전체 큐의 크기
    DoublyLinkedList head;
    DoublyLinkedList tail;

    public DesignCircularQueue(int k) {
        // 이중 연결 리스트 2개 생성
        head = new DoublyLinkedList(0);
        tail = new DoublyLinkedList(0);
        // 서로 연결
        head.right = tail;
        tail.left = head;
        // 전체 큐의 크기 지정
        this.k = k;
        // 현재 큐의 크기 지정
        this.len = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        DoublyLinkedList node = new DoublyLinkedList(value);
        node.right = head.right;
        node.left = head;
        head.right.left = node;
        head.right = node;
        len++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        DoublyLinkedList node = new DoublyLinkedList(value);
        node.left = tail.left;
        node.right = tail;
        tail.left.right = node;
        tail.left = node;
        len++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        // head 오른쪽 노드 연결에서 끊음
        head.right.right.left = head;
        head.right = head.right.right;
        len--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        // tail 왼쪽 노드 연결에서 끊음
        tail.left.left.right = tail;
        tail.left = tail.left.left;
        len--;
        return true;
    }

    public int getFront() {
        // 맨 앞 값 반환 (head 오른쪽)
        return (isEmpty()) ? -1 : head.right.val;
    }

    public int getRear() {
        // 맨 뒤 값 반환 (tail 왼쪽)
        return (isEmpty()) ? -1 : tail.left.val;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == k;
    }
 }
