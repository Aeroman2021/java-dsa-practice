package dsa.p01_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1 - Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 * <p>
 * Given an array of integers nums and an integer target, return the indices of the
 * two numbers that add up to target. Exactly one solution exists, and you may not
 * use the same element twice. Order of the returned indices does not matter.
 * <p>
 * Example: nums = [2,7,11,15], target = 9 -> [0,1]
 * nums = [3,3],       target = 6 -> [0,1]
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
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storeMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (storeMap.containsKey(pair)) {
                result[0] = i;
                result[1] = storeMap.get(pair);
                return result;
            }
            storeMap.put(nums[i], i);
        }

        return null;
    }
}
