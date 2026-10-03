package dsa.p01_hashing;

import java.util.*;

/**
 * LeetCode 49 - Group Anagrams (Medium)
 * https://leetcode.com/problems/group-anagrams/
 * <p>
 * Given an array of strings, group the anagrams together. Any order of groups
 * (and of words inside a group) is accepted.
 * <p>
 * Example: ["eat","tea","tan","ate","nat","bat"]
 * -> [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * سؤال کلیدی: کلید (key) هر گروه توی HashMap چی باید باشه؟
 * <p>
 * ---------------------------------------------------------------
 * قبل از کد زدن:
 * ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 * ۲. کجاش کار تکراری انجام میده؟ ساختمان داده‌ای هست که حذفش کنه؟
 * ۳. بعد کد بزن و تست رو اجرا کن.
 * <p>
 * Time:  O(?)
 * Space: O(?)
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            String key = sorter(str);
            result.computeIfAbsent(key, value -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(result.values());

    }


    private static String sorter(String str) {
        char[] word = str.toCharArray();
        Arrays.sort(word);
        String key = new String(word);
        return key;
    }


}
