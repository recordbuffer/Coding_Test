package org.example.array;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,4};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int solution(int[] nums) {
        int maxLen = 1;

        if (nums.length > 1) {
            int increase = nums[1] - nums[0];
            for (int i=0; i<nums.length -1; i++) {
                if (increase == 0 || nums[i+1] - nums[i] != increase) {
                    increase = nums[i+1] - nums[i];
                } else {
                    maxLen++;
                }
            }
        }
        return maxLen;
    }

    public static int findLengthOfLCIS(int[] nums) {
        int len=1,max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
                len++;
            else
            {
                max=Math.max(len,max);
                len=1;
            }
        }
        return Math.max(max,len);
    }
}
