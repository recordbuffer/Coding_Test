package org.example.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(Arrays.stream(multiply(nums)).toArray());
    }


    private static int[] multiply(int[] nums) {
        int[] res = new int[nums.length];
        // 왼쪽 곱셈
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = p;         // res[i]에 저장되는 값은 현재 인덱스의 왼쪽에 있는 모든 요소의 곱
            // 왼쪽 곱셈 결과
            p *= nums[i];
        }
        // 오른쪽 곱셈, 왼쪽 곱셈 결과에 차례로 곱하기
        p = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            res[i] *= p;        // res[i]에 더해지는 값은 현재 인덱스의 오른쪽에 있는 모든 요소의 곱
            // 왼쪽 곱셈 결과
            p *= nums[i];
        }
        return res;
    }
}
