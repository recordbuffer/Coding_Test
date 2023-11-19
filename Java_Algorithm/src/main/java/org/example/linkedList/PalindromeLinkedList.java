package org.example.linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(1);

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

//        System.out.println(deque(head));
        System.out.println(runner(head));
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /*
    * ListNode로 풀어야 해서 실패
    */
    private static boolean solution(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
    * 양 끝단 요소를 추출해 펠린드롬 여부 확인 > 데크 사용
    */
    private static boolean deque(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        ListNode node = head;
        // 연결리스트를 데크에 삽입
        while (node!=null) {
            deque.add(node.val);
            node = node.next;
        }

        while (!deque.isEmpty() && deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

    /*
    * 러너 기법 : 연결 리스트를 순회할 때 2개의 포인터를 동시에 사용하는 기법
    */
    private static boolean runner(ListNode head) {
        ListNode fast = head, slow = head;


        // 빠른 러너와 느린 러너 각각 출발
        // 빠른 러너는 두칸씩.. 느린 러너는 한칸씩..
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 총 리스트 크기가 홀수인 경우 느린 러너 한칸 더 이동
        // 1 2 3 2 1 => 3인 팰린드롬 체크에서 배제되어야 하기 때문
        if (fast != null) slow = slow.next;

        // 느린 러너 기준으로 역순으로 연결리스트 만들기
        ListNode revers = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = revers;
            revers = slow;
            slow = next;
        }

        // 역순 연결리스트를 기존 연결 리스트와 비교
        while (revers != null) {
            if (revers.val != head.val)
                return false;
            revers = revers.next;
            head = head.next;
        }
        return true;
    }

}
