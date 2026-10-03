package dsa.p01_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217 - Contains Duplicate (Easy)
 * https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Given an integer array nums, return true if any value appears at least twice,
 * and false if every element is distinct.
 * <p>
 * Example: [1,2,3,1] -> true      [1,2,3,4] -> false
 * <p>
 * ---------------------------------------------------------------
 * قبل از کد زدن:
 * ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 * ۲. کجاش کار تکراری انجام میده؟ ساختمان داده‌ای هست که حذفش کنه؟
 * ۳. بعد کد بزن و تست رو اجرا کن.
 * <p>
 * Time:  O(n)
 * Space: O(n)
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (!result.add(num))
                return true;
        }
        return false;
    }

}
