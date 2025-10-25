package KadaneAlgorithm;

// File: Arrays/MaxSubarraySum.java
// Topic: Arrays
// Problem: Find the Largest Sum Contiguous Subarray
// Difficulty: Medium
// Approach: Kadane's Algorithm (Dynamic Programming - O(n))

public class MaxSubarraySum {

    public static int findMaxSubarraySum(int[] arr) {
        int maxSum = arr[0]; // Initialize with the first element
        int currentSum = arr[0]; // Tracks current subarray sum

        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            // Either start a new subarray or continue the current one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    /**
     * Main method for testing the algorithm.
     */
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr1)); // Output: 11

        // Example 2
        int[] arr2 = { -2, -4 };
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr2)); // Output: -2

        // Example 3
        int[] arr3 = { 5, 4, 1, 7, 8 };
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(arr3)); // Output: 25
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * 1. Kadane’s Algorithm → O(n) time, O(1) space.
 * 2. Decides at each index whether to start fresh or extend.
 * 3. Works even if all numbers are negative.
 * 4. Essential for array-based interview rounds.
 * ---------------------------------------------
 */

// 🧠 Personal Note:
// Initially tried brute force (O(n^2)) but optimized to Kadane’s after
// debugging.
// The key realization was tracking currentSum dynamically instead of
// recalculating each time.
