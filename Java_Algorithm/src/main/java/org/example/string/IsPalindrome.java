package org.example.string;

public class IsPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome("  "));

        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("race a car"));
        System.out.println(isPalindrome2("  "));
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Character.isLetterOrDigit : 영어숫자인지 판별
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    private static boolean isPalindrome2(String s) {
        String _s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String s_reversed = new StringBuilder(_s).reverse().toString();
        return _s.equals(s_reversed);
        /*
        속도 저하
        1. 원시 자료형 직접 비교함
        2. 정규식 사용함
        */
    }
}
