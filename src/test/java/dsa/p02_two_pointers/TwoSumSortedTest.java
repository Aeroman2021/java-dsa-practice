package dsa.p02_two_pointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedTest {
    private final TwoSumSorted sut = new TwoSumSorted();

    @Test void basic()        { assertArrayEquals(new int[]{1, 2}, sut.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void firstAndLast() { assertArrayEquals(new int[]{1, 3}, sut.twoSum(new int[]{2, 3, 4}, 6)); }
    @Test void negatives()    { assertArrayEquals(new int[]{1, 2}, sut.twoSum(new int[]{-1, 0}, -1)); }
    @Test void duplicates()   { assertArrayEquals(new int[]{4, 5}, sut.twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)); }
}
