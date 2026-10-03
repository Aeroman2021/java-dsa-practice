package dsa.p01_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence sut = new LongestConsecutiveSequence();

    @Test void example1()     { assertEquals(4, sut.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})); }
    @Test void example2()     { assertEquals(9, sut.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})); }
    @Test void empty()        { assertEquals(0, sut.longestConsecutive(new int[]{})); }
    @Test void duplicates()   { assertEquals(3, sut.longestConsecutive(new int[]{1, 2, 2, 3})); }
    @Test void negatives()    { assertEquals(3, sut.longestConsecutive(new int[]{-1, -3, -2, 10})); }
}
