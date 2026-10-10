package dsa.p02_two_pointers;

/**
 * LeetCode 167 - Two Sum II, Input Array Is Sorted (Medium)
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * The array "numbers" is sorted in non-decreasing order. Find two numbers that add up
 * to target and return their indices, 1-indexed, as [index1, index2] with index1 < index2.
 * Exactly one solution exists. You may not use the same element twice.
 * Your solution must use only constant extra space.
 *
 * Example: numbers = [2,7,11,15], target = 9  -> [1,2]
 *          numbers = [2,3,4],     target = 6  -> [1,3]
 *
 * سؤال کلیدی: TwoSum مرحله‌ی قبل حافظه‌ی O(n) داشت. مرتب بودن آرایه چه چیزی رو عوض می‌کنه؟
 * دقت کن: اندیس‌ها از 1 شروع میشن، نه 0.

 * ---------------------------------------------------------------
 * قبل از کد زدن:
 *   ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 *   ۲. دو اشاره‌گر از کجا شروع می‌کنن و با چه قانونی حرکت می‌کنن؟
 *   ۳. بعد کد بزن و تست رو اجرا کن.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class TwoSumSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result[0] = left+1;
                result[1] =  right+1;
                return result;
            }
            if (sum> target) right--;
            if (sum < target) left++;
        }
        return null;
    }
}
