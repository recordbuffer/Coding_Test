package org.example.array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {8, 1, 5, 3, 6, 4};
//        System.out.println(bruteForce(nums));
        System.out.println(gap(nums));
    }

    private static int bruteForce(int[] nums) {
        int maxProfit = 0;
        // 구매 시점 순회
        for (int i = 0; i < nums.length; i++) {
            // 판매 시점 순회
            for (int j = 0; j < nums.length; j++) {
                maxProfit = Math.max(maxProfit, nums[j] - nums[i]);
            }
        }
        return maxProfit;
    }

    private static int gap(int[] nums) {
        int maxProfit = 0;
        // 저점은 일단 첫번째 값
        int minPrice = nums[0];

        for (int n : nums) {
            // 저점 비교
            minPrice = Math.min(minPrice, n);
            // 현재 값과 저점의 차이가 최대인 경우 교체
            maxProfit = Math.max(maxProfit, n - minPrice);
        }
        return maxProfit;
    }
}
