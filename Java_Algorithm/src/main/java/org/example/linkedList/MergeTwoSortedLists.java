package org.example.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(3);
        list.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);

//        System.out.println(solution(list, list2));
        System.out.println(mergeTwoList(list, list2));
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

    /*
     * ListNode에 빈값이 들어오는 경우는 사용 못함
     */
    private static ListNode solution(ListNode list, ListNode list2) {
        // 한개의 리스트로 만들어 정렬
        List<Integer> arr = new ArrayList<>();

        while (list != null) {
            arr.add(list.val);
            list = list.next;
        }
        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);

        ListNode res = new ListNode(arr.get(0));
        ListNode current = res;

        // arr를 다시 연결리스트로
        for (int i = 1; i < arr.size(); i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        return res;
    }

    /*
     * 재귀로 풀기 => 작은 쪽이 계속 엮이는 방향
     */
    private static ListNode mergeTwoList(ListNode list, ListNode list2) {
        // 빈값 여부 확인
        if (list == null) return list2;
        if (list2 == null) return list;

        // 노드 비교 후 작은 쪽에 재귀 호출 결과 엮기
        if (list.val <list2.val) {
            list.next = mergeTwoList(list.next, list2);
            return list;
        } else {
            list2.next = mergeTwoList(list, list2.next);
            return list2;
        }
    }
}
