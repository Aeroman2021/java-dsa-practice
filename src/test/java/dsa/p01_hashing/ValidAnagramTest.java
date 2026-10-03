package dsa.p01_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram sut = new ValidAnagram();

    @Test void anagram()           { assertTrue(sut.isAnagram("anagram", "nagaram")); }
    @Test void notAnagram()        { assertFalse(sut.isAnagram("rat", "car")); }
    @Test void differentLengths()  { assertFalse(sut.isAnagram("ab", "abb")); }
    @Test void sameLettersDifferentCounts() { assertFalse(sut.isAnagram("aab", "abb")); }
    @Test void emptyStrings()      { assertTrue(sut.isAnagram("", "")); }
}
