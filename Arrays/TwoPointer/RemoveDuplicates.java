package Arrays.TwoPointer;

/*
 * 🧩 Category: Arrays | Technique: Two Pointers
 * 🧠 Problem: Remove Duplicates from Sorted Array
 * 🔗 LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * 🎯 Goal:
 * Given a sorted array `nums`, remove duplicates in-place so that each unique
 * element appears only once. Return the count of unique elements.
 *
 * ✅ Example:
 * Input:  nums = [1, 1, 2]
 * Output: 2, nums = [1, 2, _]
 *
 * 💡 Approach:
 * 1. Use two pointers:
 *    - `i` → index of the next position for a unique element
 *    - `j` → scans the array for new unique numbers
 * 2. Whenever `nums[j] != nums[i - 1]`, copy `nums[j]` to `nums[i]` and increment `i`.
 * 3. Return `i` (the number of unique elements).
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class RemoveDuplicates {

    // Removes duplicates in a sorted array in-place
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1; // Next unique position

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // Count of unique elements
    }

    // 👇 Local test runner for quick verification
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int uniqueCount = solution.removeDuplicates(nums);
        System.out.println("Unique elements count: " + uniqueCount);

        System.out.print("Modified array: ");
        for (int k = 0; k < uniqueCount; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Efficient two-pointer technique (O(n), O(1))
 * ✅ Works only on sorted arrays
 * ✅ Core concept used in many in-place array problems
 * ---------------------------------------------
 */
