package org.example.string;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "dcbabcdd";
        System.out.println(longestPalindrome(str));
    }

    static int left, maxLen;

    private static void extendPalindrome(String str, int j, int k) {
        // 투 포인터가 유효한 범위이고, 양쪽 끝 문자가 일치하는 펠린드롬인 경우 범위 확장
        while(j >=0 && k < str.length() && str.charAt(j) == str.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }

    private static String longestPalindrome(String str) {
        int len = str.length();

        // 문자 길이 1인 경우는 펠린드롬 가능 X > 예외 처리
        if(len < 2) return str;

        // 투 포인터 조사
        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(str, i, i+1);
            extendPalindrome(str, i, i+2);
        }
//        펠린드롬을 찾고, 가장 긴 펠린드롬을 찾아 리턴해야하기 때문에 확장도 진행
        return str.substring(left, left+maxLen);
    }
}
