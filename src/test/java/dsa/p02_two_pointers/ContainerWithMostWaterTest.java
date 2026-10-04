package dsa.p02_two_pointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWater sut = new ContainerWithMostWater();

    @Test void example()       { assertEquals(49, sut.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); }
    @Test void twoLines()      { assertEquals(1, sut.maxArea(new int[]{1, 1})); }
    @Test void edgesTallest()  { assertEquals(16, sut.maxArea(new int[]{4, 3, 2, 1, 4})); }
    @Test void smallMiddle()   { assertEquals(2, sut.maxArea(new int[]{1, 2, 1})); }
}
