package dsa.p01_hashing;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private final GroupAnagrams sut = new GroupAnagrams();

    /** Order-independent comparison: sort words in each group, then sort the groups. */
    private Set<List<String>> normalize(List<List<String>> groups) {
        return groups.stream()
                .map(g -> g.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toSet());
    }

    @Test void example() {
        var result = sut.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        var expected = Set.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        assertEquals(expected, normalize(result));
    }

    @Test void emptyString() {
        assertEquals(Set.of(List.of("")), normalize(sut.groupAnagrams(new String[]{""})));
    }

    @Test void singleWord() {
        assertEquals(Set.of(List.of("a")), normalize(sut.groupAnagrams(new String[]{"a"})));
    }
}
