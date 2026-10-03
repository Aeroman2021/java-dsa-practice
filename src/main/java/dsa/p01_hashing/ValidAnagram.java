package dsa.p01_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 242 - Valid Anagram (Easy)
 * https://leetcode.com/problems/valid-anagram/
 * <p>
 * Given two strings s and t (lowercase English letters), return true if t is an
 * anagram of s: same letters, same counts, any order.
 * <p>
 * Example: s = "anagram", t = "nagaram" -> true
 * s = "rat",     t = "car"     -> false
 * <p>
 * ---------------------------------------------------------------
 * قبل از کد زدن:
 * ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 * ۲. کجاش کار تکراری انجام میده؟ ساختمان داده‌ای هست که حذفش کنه؟
 * ۳. بعد کد بزن و تست رو اجرا کن.
 * <p>
 * Time:  O(n)
 * Space: O(1)
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> result = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0) + 1);
            result.put(t.charAt(i), result.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Integer value : result.values()) {
            if (!value.equals(0)) return false;
        }

        return true;
    }
}
