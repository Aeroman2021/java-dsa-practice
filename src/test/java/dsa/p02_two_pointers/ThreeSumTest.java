package dsa.p02_two_pointers;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    private final ThreeSum sut = new ThreeSum();

    /** Sorts each triplet so order doesn't matter. Keeps a List so duplicates are still visible. */
    private List<List<Integer>> normalize(List<List<Integer>> triplets) {
        return triplets.stream()
                .map(t -> t.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private void assertTriplets(Set<List<Integer>> expected, List<List<Integer>> actual) {
        List<List<Integer>> norm = normalize(actual);
        assertEquals(norm.size(), new HashSet<>(norm).size(), "Answer contains duplicate triplets: " + norm);
        assertEquals(expected, new HashSet<>(norm));
    }

    @Test void example() {
        assertTriplets(Set.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), sut.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test void noAnswer() {
        assertTriplets(Set.of(), sut.threeSum(new int[]{0, 1, 1}));
    }

    @Test void allZeros() {
        assertTriplets(Set.of(List.of(0, 0, 0)), sut.threeSum(new int[]{0, 0, 0, 0}));
    }

    @Test void manyDuplicates() {
        assertTriplets(Set.of(List.of(-2, 0, 2), List.of(-2, 1, 1)), sut.threeSum(new int[]{-2, 0, 0, 2, 2, 1, 1, -2}));
    }
}
