package com.company.leetcode;

import java.util.Arrays;
// Two Sum
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 7, 4};
        System.out.println(Arrays.toString(twoSum(array,10)));
    }
}
