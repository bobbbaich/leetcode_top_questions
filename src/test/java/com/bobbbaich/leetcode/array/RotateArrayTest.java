package com.bobbbaich.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RotateArrayTest {

    private RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @MethodSource
    @ParameterizedTest(name = "index={index} nums={0} k={1}")
    void testRotate(int[] nums, int k) {
        rotateArray.rotate(nums, k);
    }

    private static Stream<Arguments> testRotate() {
        return Stream.of(
                Arguments.of(new int[]{}, 0)
        );
    }

}