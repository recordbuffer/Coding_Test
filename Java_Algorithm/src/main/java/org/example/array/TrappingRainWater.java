package org.example.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        System.out.println(toPointer(nums));
        System.out.println(stacks(nums));
    }

    private static int toPointer(int[] nums) {
        int volume = 0;
        int left = 0;
        int right = nums.length - 1;
        int leftMax = nums[left];
        int rightMax = nums[right];

        // 최대 지점에서 좌우 포인터가 만나게 됨 O(n)
        while (left < right) {
            leftMax = Math.max(nums[left], leftMax);
            rightMax = Math.max(nums[right], rightMax);

            // 더 높은 쪽을 향해 투 포인터 이동
            if (leftMax <= rightMax) {
                // 각각 좌우 막대 높이 leftMax, rightMax가 현재 높이와의 차이만큼 물 높이 volume 더함
                volume += leftMax - nums[left];
                left += 1;
            } else {
                volume += rightMax - nums[right];
                right -=1;
            }
        }
        return volume;
    }

    private static int stacks(int[] nums) {
        // 현재 높이가 이전 높이보다 높을 때 (변곡점) => 격차만큼 물 높이 volume 더함
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;

        for (int i = 0; i < nums.length; i++) {
            // 변곡점을 만나는 경우
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                Integer top = stack.pop();

                if (stack.isEmpty()) break;

                // 거리는 현재 인덱스 i와 스택의 맨 위 요소 stack.peek() 사이의 거리
                int distance = i - stack.peek() - 1;
                // 현재 높이나 스택의 마지막 위치 높이 중 낮은 값에 변곡점의 높이의 차이만큼 물 높이
                int waters = Math.min(nums[i], nums[stack.peek()]) - nums[top];
                // volume은 거리 * 물 높이
                volume += distance * waters;
            }
            stack.push(i);
        }
        return volume;
    }
}
