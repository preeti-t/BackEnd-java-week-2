package arrays.exercises;

/**
 * Exercise 6: Binary Search
 * TO DO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Exercise6
{
    public static void main(String[] args)
    {
        int[] arr = { 110, 210, 13, 40, 29 }; // Created  an array of integers.

        Arrays.sort(arr);                                         // Array sorted
        System.out.println("Sorted: " + Arrays.toString(arr));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int key = scanner.nextInt();

        scanner.close();
        int index = Arrays.binarySearch(arr, key);      // Implemented binary search.

        if (index > -1)                                            //Result
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
