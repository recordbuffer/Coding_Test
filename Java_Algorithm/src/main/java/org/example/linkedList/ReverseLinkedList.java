package org.example.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next = new ListNode(5);
        list.next.next.next = new ListNode(6);

//        System.out.println(reverseList(list));
        System.out.println(repeatReverse(list));
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

    private static ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private static ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) return prev;

        // 현재 노드의 다음 노트 미리 지정
        ListNode next = node.next;
        // 현재 노드의 다음으로 이전 노드 지정
        node.next = prev;
        // 다음 노드와 현재 노드를 파라미터로 하여 재귀 호출
        return reverse(next, node);
    }

    private static ListNode repeatReverse(ListNode head) {
        ListNode prev = null, node = head;

        while (node != null) {
            // 현재 노드의 다음 노트 미리 지정
            ListNode next = node.next;
            // 현재 노드의 다음으로 이전 노드 지정
            node.next = prev;
            // 이전 노드는 현재 노드로 지정
            prev = node;
            // 미리 지정한 다음 노드를 현재 노드로 지정
            node = next;
        }
        return prev;
    }
}
