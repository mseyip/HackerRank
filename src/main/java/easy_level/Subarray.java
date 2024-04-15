package easy_level;

import java.util.*;

public class Subarray {

    /*
    We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, a[i], in array A.

Constraints
1 <= n <= 100
-10^4<= a[i] <=10^4
Output Format

Print the number of subarrays of A having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of A=[1, -2, 4, -5, 1]:

1. . [1/1] Rightarrow-2

2. [3/3] Rightarrow-5

3. [0:1] Rightarrow 1 - 2 = - 1

4. [2:3] Rightarrow 4 - 5 = - 1

5. [3:4] Rightarrow - 5 + 1 = - 4

6. [1:3] Rightarrow - 2 + 4 - 5 = - 3

7. [0:3] Rightarrow 1 - 2 + 4 - 5 = - 2

8. [1:4] Rightarrow - 2 + 4 - 5 + 1 = - 2

9. [0:4] Rightarrow 1 - 2 + 4 - 5 + 1 = -1
Thus, we print  on a new line.
     */

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Read the length of the array
    int n = scanner.nextInt();

    // Create an array to store the elements
    int[] a = new int[n];

    // Read the elements of the array
        for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
    }

    // Close the scanner
        scanner.close();

    // Count the number of negative subarrays
    int countNegativeSubarrays = 0;

    // Iterate through all subarrays
        for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += a[j];
            if (sum < 0) {
                countNegativeSubarrays++;
            }
        }
    }

    // Print the result
        System.out.println(countNegativeSubarrays);
}
}