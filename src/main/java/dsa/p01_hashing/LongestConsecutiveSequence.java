package dsa.p01_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 128 - Longest Consecutive Sequence (Medium)
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * Given an unsorted array nums, return the length of the longest run of
 * consecutive integers. Must run in O(n) time (so sorting is not allowed).
 *
 * Example: [100,4,200,1,3,2] -> 4   (1,2,3,4)
 *          [0,3,7,2,5,8,4,6,0,1] -> 9
 *
 * سؤال کلیدی: از کجا بفهمی یک عدد «شروع» یک دنباله‌ست؟

 * ---------------------------------------------------------------
 * قبل از کد زدن:
 *   ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 *   ۲. کجاش کار تکراری انجام میده؟ ساختمان داده‌ای هست که حذفش کنه؟
 *   ۳. بعد کد بزن و تست رو اجرا کن.
 *
 * Time:  O(n)
 * Space: O(n)
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        Set<Integer> storage = new HashSet<>();
        for (int num : nums) {
            storage.add(num);
        }

        for (Integer num : storage) {
            int count = 1;
            int current = num;
            if (!storage.contains(num - 1)) {
                while (storage.contains(current + 1)){
                        count ++;
                        current++;
                }

                if (count > maxCount)
                    maxCount = count;

            }
        }
        return maxCount;
    }
}

