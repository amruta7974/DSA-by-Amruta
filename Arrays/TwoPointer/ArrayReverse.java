package Arrays.TwoPointer;

/*
 * 🧩 Category: Arrays | Technique: Two Pointers
 * 🧠 Problem: Reverse an Array In-Place
 *
 * 🎯 Goal:
 * Given an array `arr[]`, reverse it in-place so that the first element becomes
 * the last, the second becomes the second-last, and so on.
 *
 * ✅ Example 1:
 * Input:  [1, 4, 3, 2, 6, 5]
 * Output: [5, 6, 2, 3, 4, 1]
 *
 * ✅ Example 2:
 * Input:  [4, 5, 1, 2]
 * Output: [2, 1, 5, 4]
 *
 * 💡 Approach:
 * 1. Use two pointers — `left` (start) and `right` (end).
 * 2. Swap elements at these positions.
 * 3. Move `left` forward and `right` backward.
 * 4. Continue until `left >= right`.
 *
 * 🕒 Time Complexity: O(n)
 * 🧩 Space Complexity: O(1)
 */

public class ArrayReverse {

    // Reverses the array in-place using two-pointer approach
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // 👇 Local test runner for quick verification
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        System.out.print("Original Array: ");
        for (int num : arr) System.out.print(num + " ");

        reverseArray(arr);

        System.out.print("\nReversed Array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}

/*
 * ---------------------------------------------
 * 💡 Key Takeaways:
 * ---------------------------------------------
 * ✅ Two-pointer technique for in-place reversal.
 * ✅ No extra memory used → constant space.
 * ✅ Foundation for rotation, palindrome, and partition problems.
 * ---------------------------------------------
 */
