package Arrays.KadaneAlgorithm;

/*
 * 🧩 Category: Arrays | Technique: Dynamic Programming
 * 🧠 Problem: Maximum Subarray Sum (Kadane’s Algorithm)
 * 🔗 LeetCode: https://leetcode.com/problems/maximum-subarray/
 *
 * 🎯 Goal:
 * Find the contiguous subarray within a one-dimensional array `arr[]`
 * which has the largest sum.
 *
 * ✅ Example:
 * Input:  arr = [2, 3, -8, 7, -1, 2, 3]
 * Output: 11
 *
 * Explanation:
 * The subarray [7, -1, 2, 3] has the maximum sum = 11.
 *
 * 💡 Approach (Kadane’s Algorithm):
 * 1. Keep track of the current subarray sum and the global maximum.
 * 2. At each step, decide whether to start a new subarray or extend the existing one.
 * 3. Update the global maximum if the current sum is larger.
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class MaxSubarraySum {

    // Finds the largest sum of any contiguous subarray using Kadane's Algorithm.
    public static int findMaxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // 👇 Local testing method
    public static void main(String[] args) {
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {-2, -4};
        int[] arr3 = {5, 4, 1, 7, 8};

        System.out.println("Input: [2, 3, -8, 7, -1, 2, 3]");
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr1));

        System.out.println("\nInput: [-2, -4]");
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr2));

        System.out.println("\nInput: [5, 4, 1, 7, 8]");
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr3));
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Kadane’s Algorithm → O(n) time, O(1) space.
 * ✅ Chooses to extend or restart subarray dynamically.
 * ✅ Handles negative-only arrays gracefully.
 * ✅ A must-know concept for technical interviews.
 * ---------------------------------------------
 */
