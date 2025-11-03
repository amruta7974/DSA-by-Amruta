package Strings.TwoPointer;

/*
 * 🧩 Category: Strings | Technique: Two Pointers
 * 🧠 Problem: Valid Palindrome
 * 🔗 LeetCode: https://leetcode.com/problems/valid-palindrome/
 *
 * 🎯 Goal:
 * Determine whether a given string `s` is a palindrome,
 * considering only alphanumeric characters and ignoring case sensitivity.
 *
 * ✅ Example:
 * Input:  "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Explanation:
 * After cleaning → "amanaplanacanalpanama" → same backward and forward.
 *
 * 💡 Approach:
 * 1. Convert the string to lowercase.
 * 2. Remove all non-alphanumeric characters using regex.
 * 3. Use the two-pointer approach to compare characters from both ends.
 * 4. If all characters match → it’s a palindrome.
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class ValidPalindrome {

    // Checks whether a given string is a valid palindrome
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();                // Normalize case
        s = s.replaceAll("[^a-z0-9]", "");  // Remove non-alphanumeric chars

        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch → not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }

    // 👇 Local test runner for quick testing in VS Code
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println("Input: " + input1);
        System.out.println("Is Palindrome? " + solution.isPalindrome(input1));

        System.out.println("\nInput: " + input2);
        System.out.println("Is Palindrome? " + solution.isPalindrome(input2));
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Two-pointer approach on cleaned string
 * ✅ Ignores case and non-alphanumeric characters
 * ✅ Linear time, constant space
 * ---------------------------------------------
 */
