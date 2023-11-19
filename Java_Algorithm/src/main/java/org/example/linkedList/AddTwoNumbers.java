package org.example.linkedList;

import java.math.BigInteger;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(2);

//        System.out.println(addTwoNumbers(list, list2));
        System.out.println(fullAdder(list, list2));
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

    private static ListNode fullAdder(ListNode list, ListNode list2) {
        // 값 계산할 임시 노드 선언
        ListNode node = new ListNode(0);
        ListNode root = node;

        int sum, carry = 0, remainder;
        while (list != null || list2 != null || carry != 0) {
            sum = 0;
            // 리스트1 합산 및 진행
            if (list != null) {
                sum += list.val;
                list = list.next;
            }
            // 리스트2 합산 및 진행
            if (list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }
            // 노드의 값으로 사용할 나머지 계산
            remainder = (sum + carry) % 10;

            // 몫 => 자릿수 증가 => 자리올림수
            carry = (sum + carry) / 10;

            // 나머지는 다음 노드의 값으로 지정
            node.next = new ListNode(remainder);
            node = node.next;
        }
        // 첫번째는 임시 노드니 그후 결과 리턴
        return root.next;
    }


    private static ListNode addTwoNumbers(ListNode list, ListNode list2) {
        // 두 노드를 역순으로 뒤집어 숫자로 변환
        BigInteger b1 = reverseAndReturnInt(list);
        BigInteger b2 = reverseAndReturnInt(list2);

        BigInteger res = b1.add(b2);

        // 다시 역순 노드로 변환
        ListNode prev = null, node = null;
        for (char c : String.valueOf(res).toCharArray()) {
            node = new ListNode(Character.getNumericValue(c));
            node.next = prev;
            prev = node;
        }
        return node;
    }

    private static BigInteger reverseAndReturnInt(ListNode head) {
        // 역순으로 변환
        ListNode prev = null, node = head;
        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        // 숫자로 변환
        String val = "";
        while (node != null) {
            val += node.val;
            node = node.next;
        }
        return new BigInteger(val);
    }

}
