package com.bobbbaich.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
    }

    @MethodSource
    @ParameterizedTest(name = "index={index} prices={0} expectedResult={1}")
    void maxProfit(int[] prices, int expectedResult) {
        int actualResult = bestTimeToBuyAndSellStockII.maxProfit(prices);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> maxProfit() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1}, 3),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{7, 7, 1, 1, 5, 5, 3, 3, 6, 6, 4, 4}, 7),
                Arguments.of(new int[]{0, 1, 2, 10, 9, 1, 0}, 10),
                Arguments.of(new int[]{0, 1, 2, 10, 9, 1}, 10),
                Arguments.of(new int[]{1, 2, 10, 9, 1, 0}, 9),
                Arguments.of(new int[]{1, 2, 10, 9, 1}, 9),
                Arguments.of(new int[]{2, 1, 2, 0, 1}, 2)
        );
    }
}