package dsa.p01_hashing;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum sut = new TwoSum();

    private int[] sorted(int[] a) { int[] c = a.clone(); Arrays.sort(c); return c; }

    @Test void basic()           { assertArrayEquals(new int[]{0, 1}, sorted(sut.twoSum(new int[]{2, 7, 11, 15}, 9))); }
    @Test void notAtStart()      { assertArrayEquals(new int[]{1, 2}, sorted(sut.twoSum(new int[]{3, 2, 4}, 6))); }
    @Test void sameValueTwice()  { assertArrayEquals(new int[]{0, 1}, sorted(sut.twoSum(new int[]{3, 3}, 6))); }
    @Test void negatives()       { assertArrayEquals(new int[]{2, 4}, sorted(sut.twoSum(new int[]{-1, -2, -3, -4, -5}, -8))); }
    @Test void zeroTarget()      { assertArrayEquals(new int[]{0, 3}, sorted(sut.twoSum(new int[]{0, 4, 3, 0}, 0))); }
}
