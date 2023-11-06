package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;

//        System.out.println(solution(nums, target));
//        System.out.println(hasMap(nums, target));
//        System.out.println(hasMap2(nums, target));
        System.out.println(toPointer(nums, target));
    }

    private static int[] solution(int[] nums, int target) {
        // 무차별 대입 방식 => 브루트 포스
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static int[] hasMap(int[] nums, int target) {
        // HashMap을 사용했기에 시간 복잡도가 O(1)
        Map<Integer, Integer> numMap = new HashMap<>();
        // 키와 값 바꿔서 맵으로 저장
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            // 해당 값의 키가 map에 존재하고 현재 인덱스가 아닌 값일 경우
            if (numMap.containsKey(target - nums[i]) && i != numMap.get(target - nums[i])) {
                return new int[]{i, numMap.get(target - nums[i])};
            }
        }
        return null;
    }

    private static int[] hasMap2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // target에서 num 뺀 값 있으면 정답
            if (numMap.containsKey(target - nums[i])) {
                return new int[] {numMap.get(target - nums[i]), i};
            }
            // 없으면 일단 비교를 위해 저장
            numMap.put(nums[i], i);
        }
        return null;
    }

    private static int[] toPointer(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left != right) {
            // 합이 target보다 작으면 왼쪽 포인터를 오른쪽으로 이동
            if (nums[left] + nums[right] < target) {
                left+= 1;

            // 합이 target보다 크면 오른쪽 포인터를 왼쪽으로 이동
            } else if (nums[left] + nums[right] > target) {
                right-=1;
            } else {
                return new int[] {left, right};
            }
        }
        return null;
    }
}
