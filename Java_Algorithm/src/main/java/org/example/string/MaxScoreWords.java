package org.example.string;

public class MaxScoreWords {
    public static void main(String[] args) {
        String[] words = new String[]{"dog","cat","dad","good"};
        char[] letters = new char[]{'a','a','c','d','d','d','g','o','o'};
        int[] score = new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(solution(words, letters, score));
    }

    private static int solution(String[] words, char[] letters, int[] score) {
        return 0;
    }
}
