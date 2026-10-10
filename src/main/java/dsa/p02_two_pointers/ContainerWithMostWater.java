package dsa.p02_two_pointers;

/**
 * LeetCode 11 - Container With Most Water (Medium)
 * https://leetcode.com/problems/container-with-most-water/
 *
 * height[i] is the height of a vertical line at position i. Pick two lines that,
 * together with the x-axis, form a container holding the most water.
 * Return the maximum amount of water: (j - i) * min(height[i], height[j]).
 *
 * Example: [1,8,6,2,5,4,8,3,7] -> 49   (lines at index 1 and 8: width 7 * height 7)
 *          [1,1]               -> 1
 *
 * سؤال کلیدی: وقتی دو اشاره‌گر دو سر آرایه‌ان، کدوم رو حرکت بدی و چرا؟

 * ---------------------------------------------------------------
 * قبل از کد زدن:
 *   ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 *   ۲. دو اشاره‌گر از کجا شروع می‌کنن و با چه قانونی حرکت می‌کنن؟
 *   ۳. بعد کد بزن و تست رو اجرا کن.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int max = 0;
        int right  = height.length-1;
        while (left< right){
            int capacity  = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max,capacity);

            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}
