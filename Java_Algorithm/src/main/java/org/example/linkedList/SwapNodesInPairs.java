package org.example.linkedList;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println(swapPairsValue(head));
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

    private static ListNode swapPairsValue(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            int tmp;
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;

            // 페어로 스왑하니까 두 칸 앞으로 이동
            node = node.next.next;
        }
        return head;
    }

    private static ListNode repeatSwap(ListNode head) {
        ListNode node = head;
        ListNode root = node;
        node.next = head;

        while (node.next != null && node.next.next != null) {
            ListNode a = node.next;
            ListNode b = node.next.next;

            //위치 변경
            a.next = b.next;
            node.next = b;
            node.next.next = a;

            // 페어로 스왑하니까 두 칸 앞으로 이동
            node = node.next.next;
        }
        return root.next;
    }
}
