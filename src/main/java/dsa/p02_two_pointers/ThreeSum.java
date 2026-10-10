package dsa.p02_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode 15 - 3Sum (Medium)
 * https://leetcode.com/problems/3sum/
 *
 * Return all unique triplets [a, b, c] from nums (different indices) such that
 * a + b + c == 0. The answer must not contain duplicate triplets.
 * Order of triplets (and of numbers inside each triplet) does not matter.
 *
 * Example: [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]
 *          [0,1,1]          -> []
 *          [0,0,0]          -> [[0,0,0]]
 *
 * سرنخ: یک عدد رو ثابت نگه دار؛ مسئله‌ی باقی‌مونده چه شکلیه؟
 * سخت‌ترین قسمت: حذف جواب‌های تکراری.

 * ---------------------------------------------------------------
 * قبل از کد زدن:
 *   ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 *   ۲. دو اشاره‌گر از کجا شروع می‌کنن و با چه قانونی حرکت می‌کنن؟
 *   ۳. بعد کد بزن و تست رو اجرا کن.
 *
 * Time:  O(?)
 * Space: O(?)
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i +1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == -nums[i] ) {
                    result.add(List.of(nums[left],nums[right],nums[i]));
                    left++;
                    right--;
                }
                if (sum > -nums[i]) right--;
                if (sum < -nums[i]) left++;
                while (left < right && nums[left] == nums[left - 1]) left++;
            }

        }
        return result;
    }
}
