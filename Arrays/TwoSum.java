package Arrays;


/*
 * 🧩 Category: Arrays | Technique: Brute Force
 * 🧠 Problem: Two Sum
 * 🔗 LeetCode: https://leetcode.com/problems/two-sum/
 *
 * 🎯 Goal:
 * Given an array of integers `nums` and an integer `target`,
 * return the indices of the two numbers such that they add up to the target.
 * 
 * You may assume that each input has exactly one solution,
 * and you may not use the same element twice.
 *
 * ✅ Example:
 * Input:  nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * 
 * Explanation:
 * nums[0] + nums[1] = 2 + 7 = 9 → indices [0, 1]
 *
 * 💡 Approach:
 * 1. Use a brute-force approach: check all pairs of numbers.
 * 2. For each element, iterate through all elements after it.
 * 3. If a pair sums to the target, return their indices.
 *
 * 🕒 Time Complexity: O(n²)
 * 🧩 Space Complexity: O(1)
 */


public class TwoSum {

    /**
     * Finds indices of two numbers that add up to the given target.
     *
     * @param nums   input array of integers
     * @param target target sum
     * @return array of two indices whose elements sum up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // For each element, check all elements that come after it
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum equals the target, return the indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no valid pair is found
        throw new IllegalArgumentException("No two sum solution exists for the given input.");
    }

    /**
     * Optional main() method for local testing in VS Code
     */
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Get the result
        int[] result = ts.twoSum(nums, target);

        // Display the output
        System.out.println("Input: [2, 7, 11, 15], Target: 9");
        System.out.println("Output Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
