package Arrays.TwoPointer;

/*
 * 🧩 Category: Arrays | Technique: Two Pointers
 * 🧠 Problem: Two Sum II - Input Array Is Sorted
 * 🔗 LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * 🎯 Goal:
 * Given a sorted integer array `numbers`, find the 1-based indices of the
 * two numbers such that they add up to a specific target.
 * 
 * ✅ Example:
 * Input:  numbers = [2, 7, 11, 15], target = 9
 * Output: [1, 2]
 * Explanation: numbers[0] + numbers[1] = 9 → 2 + 7 = 9
 * 
 * 💡 Approach:
 * 1. Use two pointers since the array is sorted.
 * 2. Initialize:
 *      → left  = start of array
 *      → right = end of array
 * 3. Calculate sum = numbers[left] + numbers[right].
 * 4. If sum == target → return indices (+1 for 1-based index).
 * 5. If sum < target → move left pointer forward.
 * 6. If sum > target → move right pointer backward.
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class TwoSumII {

    // Finds two numbers that add up to the given target and returns their 1-based indices
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // +1 to convert from 0-based to 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Should never reach here since exactly one solution is guaranteed
        return new int[0];
    }

    // 👇 Local test runner for quick verification in VS Code
    public static void main(String[] args) {
        TwoSumII solution = new TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        System.out.println("Input: [2, 7, 11, 15], Target = 9");
        System.out.println("Output Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Uses Two Pointers for sorted array
 * ✅ Linear time, constant space
 * ✅ Guaranteed one valid solution
 * ---------------------------------------------
 */
