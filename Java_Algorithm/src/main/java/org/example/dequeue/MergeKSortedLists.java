package org.example.dequeue;

import org.example.linkedList.ReverseLinkedList;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(4);
        list.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list.next = new ListNode(7);

        ListNode[] lists = new ListNode[] {list, list2, list3};
        System.out.println(solution(lists).toString());
    }

    private static ListNode solution(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            // 동일한 값이면 무시
            if (o1.val == o2.val)
                return 0;
            // 새로운 값이 기본 값보다 크면 뒤에 위치
            else if (o1.val > o2.val)
                return 1;
            // 작으면 앞에 위치
            else
                return -1;
        });

        ListNode root = new ListNode(0);
        ListNode tail = root;

        // 각 연결 리스트의 첫번째 노드를 큐에 저장
        for (ListNode node: lists)
            if (node != null)
                pq.add(node);

        while (!pq.isEmpty()) {
            // 우선 순위에 따라 추출, 다음 노드로 이동
            tail.next = pq.poll();
            tail = tail.next;

            // 추출한 연결 리스트의 다음 노드는 다시 큐에 저장
            if (tail.next != null)
                pq.add(tail.next);
        }
        return root.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
