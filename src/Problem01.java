/*
Final Array State After K Multiplication Operations I
Problem Description:
You are given an integer array nums, an integer k, and an integer multiplier.

You need to perform k operations on nums. In each operation:

Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
Replace the selected minimum value x with x * multiplier.
Return an integer array denoting the final state of nums after performing all k operations.



Example 1:

Input: nums = [2,1,3,5,6], k = 5, multiplier = 2

Output: [8,4,6,5,6]

Explanation:

OperationResultAfter operation 1[2, 2, 3, 5, 6]After operation 2[4, 2, 3, 5, 6]After operation 3[4, 4, 3, 5, 6]After operation 4[4, 4, 6, 5, 6]After operation 5[8, 4, 6, 5, 6]

Example 2:

Input: nums = [1,2], k = 3, multiplier = 4

Output: [16,8]

Explanation:

OperationResultAfter operation 1[4, 2]After operation 2[4, 8]After operation 3[16, 8]

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 10
1 <= multiplier <= 5

 */


import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        System.out.print("Enter Multiplier: ");
        int m = sc.nextInt();
        problem1(arr, k, m);

    }

    public static void problem1(int[] arr, int k, int m) {
        while (k > 0) {
            int smallestIndex = 0;
            int newValue;
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                    smallestIndex = i;
                }
            }
            newValue = m * smallest;
            arr[smallestIndex] = newValue;
            k--;
        }
        System.out.print("Final Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
