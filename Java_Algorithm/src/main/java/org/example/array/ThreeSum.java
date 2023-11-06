package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -5};
//        System.out.println(solution(nums).toString());
//        System.out.println(bruteForce(nums).toString());
        System.out.println(toPointer(nums).toString());
    }

    private static List<List<Integer>> solution(int[] nums) {
//        => 타임아웃
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        // 중복 제거
        return res.stream().distinct().collect(Collectors.toList());
    }

    private static List<List<Integer>> bruteForce(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 중복 값 건너 뛰기
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = 0; j < nums.length - 1; j++) {
                // 중복 값 건너 뛰기
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = 0; k < nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                    if (nums[i] + nums[j] + nums[k] == 0) res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return res;
    }

    private static List<List<Integer>> toPointer(int[] nums) {
        int left, right, sum;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 중복된 값 건너 뛰기
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 포인터 좁혀가며 값 계산
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                // 합이 0보다 작다면 왼쪽 포인터 이동
                if (sum < 0) {
                    left += 1;
                // 합이 0보다 크다면 왼쪽 포인터 이동
                } else if (sum > 0) {
                    right -= 1;
                } else {
                    // 합이 0인 경우 추출
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 중복 값 건너 뛰기
                    while (left < right && nums[left] == nums[left + 1]) left += 1;
                    while (left < right && nums[right] == nums[right - 1]) left -= 1;

                    // 정답인 경우 투포인터 한칸씩 이동
                    left += 1;
                    right -= 1;
                }
            }
        }
        return res;
    }
}
