package dsa.p01_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private final ContainsDuplicate sut = new ContainsDuplicate();

    @Test void hasDuplicate()      { assertTrue(sut.containsDuplicate(new int[]{1, 2, 3, 1})); }
    @Test void allDistinct()       { assertFalse(sut.containsDuplicate(new int[]{1, 2, 3, 4})); }
    @Test void manyDuplicates()    { assertTrue(sut.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); }
    @Test void singleElement()     { assertFalse(sut.containsDuplicate(new int[]{7})); }
    @Test void negativeNumbers()   { assertTrue(sut.containsDuplicate(new int[]{-1, 0, -1})); }
}
