package org.example.array;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(solution(nums, k).toString());
    }


    // MostCommonWord 문제 처럼 풀면 될듯?
    private static int[] solution(int[] nums, int k) {
        Map<Integer, Integer> common = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (common.containsKey(nums[i])) {
                common.put(nums[i], common.get(nums[i]) + 1);
            } else {
                common.put(nums[i], 1);
            }
        }
        // 값 큰수로 정렬
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(common.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = entryList.get(i).getKey();
        }
        return res;
    }
}
