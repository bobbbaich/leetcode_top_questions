package com.bobbbaich.leetcode.array;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Integer.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @MethodSource
    @ParameterizedTest(name = "index={index} nums={0} expectedNums={1}")
    void testRemoveDuplicates(int[] nums, int[] expectedNums) {
        int actualLength = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        assertEquals(expectedNums.length, actualLength);
        assertArrayEquals(Arrays.stream(nums).limit(actualLength).toArray(), expectedNums);
    }

    private static Stream<Arguments> testRemoveDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 1, 2, 3, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 1, 2, 3, MAX_VALUE, MAX_VALUE}, new int[]{1, 2, 3, MAX_VALUE})
        );
    }
}