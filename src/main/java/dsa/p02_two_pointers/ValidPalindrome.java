package dsa.p02_two_pointers;

import java.util.Objects;

/**
 * LeetCode 125 - Valid Palindrome (Easy)
 * https://leetcode.com/problems/valid-palindrome/
 *
 * A phrase is a palindrome if, after converting all uppercase letters to lowercase
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Return true if s is a palindrome.
 *
 * Example: "A man, a plan, a canal: Panama" -> true   ("amanaplanacanalpanama")
 *          "race a car"                     -> false  ("raceacar")
 *          " "                              -> true   (empty after cleaning)
 *
 * چالش: بدون ساختن رشته‌ی جدید، با حافظه‌ی O(1) حلش کن.
 * به کارت میاد: Character.isLetterOrDigit و Character.toLowerCase

 * ---------------------------------------------------------------
 * قبل از کد زدن:
 *   ۱. ساده‌ترین راه‌حل (brute force) چیه؟ Big-O زمان و حافظه‌اش؟
 *   ۲. دو اشاره‌گر از کجا شروع می‌کنن و با چه قانونی حرکت می‌کنن؟
 *   ۳. بعد کد بزن و تست رو اجرا کن.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex)))
                leftIndex++;

            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex)))
                rightIndex--;

            if (!Objects.equals(s.toLowerCase().charAt(rightIndex),
                    s.toLowerCase().charAt(leftIndex)))
                return false;

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
