package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2};
//        System.out.println(ascendingOrder(nums));
        System.out.println(evenSum(nums));
    }

    private static int ascendingOrder(int[] nums) {
        int sum = 0;
        List<Integer> pair = new ArrayList<>();
        Arrays.sort(nums);

        for (int n : nums) {
            pair.add(n);
            // 페어 변수에 값이 2개 채워지면 min() 합산 -> 변수 초기화
            if (pair.size() == 2) {
                sum += Collections.min(pair);
                pair.clear();
            }
        }
        return sum;
    }

    private static int evenSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0) sum += nums[i];
        }
        return sum;
    }
}
