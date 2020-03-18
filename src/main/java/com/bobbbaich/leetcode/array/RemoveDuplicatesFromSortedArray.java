package com.bobbbaich.leetcode.array;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int uniqueElements = nums.length > 0 ? 1 : 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[uniqueElements - 1] != nums[i]) {
                uniqueElements++;
                nums[uniqueElements - 1] = nums[i];
            }
        }

        return uniqueElements;
    }
}