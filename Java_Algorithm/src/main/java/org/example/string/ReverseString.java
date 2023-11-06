package org.example.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "race a car";
        char[] charArray = s.toCharArray();

        ReverseString(charArray);
    }

    private static void ReverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
