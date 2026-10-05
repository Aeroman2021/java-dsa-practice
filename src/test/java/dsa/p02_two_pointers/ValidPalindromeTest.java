package dsa.p02_two_pointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome sut = new ValidPalindrome();

    @Test void sentence()        { assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama")); }
    @Test void notPalindrome()   { assertFalse(sut.isPalindrome("race a car")); }
    @Test void onlySpace()       { assertTrue(sut.isPalindrome(" ")); }
    @Test void digitAndLetter()  { assertFalse(sut.isPalindrome("0P")); }
    @Test void punctuationEnd()  { assertTrue(sut.isPalindrome("a.")); }
    @Test void mixedCase()       { assertTrue(sut.isPalindrome("No 'x' in Nixon")); }
    @Test
    void edgeCase(){
        assertTrue(sut.isPalindrome(".,"));
    }
}
