package Arrays;

// File: Arrays/ArrayReverse.java
// Purpose: Reverse an array in-place using two-pointer approach
// Topic: Arrays
// Difficulty: Easy
// Author: Amruta Gaikwad
// Date: October 2025

/*
 Problem Statement:
 ------------------
 Reverse an array arr[]. Reversing an array means rearranging the elements such that
 the first element becomes the last, the second element becomes second last, and so on.

 Example 1:
 Input:  [1, 4, 3, 2, 6, 5]
 Output: [5, 6, 2, 3, 4, 1]

 Example 2:
 Input:  [4, 5, 1, 2]
 Output: [2, 1, 5, 4]

 Approach:
 ---------
 1. Use two pointers — one at the start (left) and one at the end (right) of the array.
 2. Swap elements at left and right pointers.
 3. Move left forward and right backward.
 4. Continue until left >= right.
 
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class ArrayReverse {

    // Method to reverse the array in-place
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        System.out.print("Original Array: ");
        for (int num : arr)
            System.out.print(num + " ");

        reverseArray(arr);

        System.out.print("\nReversed Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

