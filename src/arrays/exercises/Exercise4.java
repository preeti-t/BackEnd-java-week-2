package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4
{
    public static void main(String[] args)
    {
        int[] arr = { 100, 20, 13, 40, 35, 29 }; // Created  an array of 6 integers.

        Arrays.sort(arr);                                         // array sorted
        System.out.println("Sorted: " + Arrays.toString(arr));
        
        int[] copy = Arrays.copyOf(arr, arr.length);             //Copied into another array
        System.out.println("Copy: " + Arrays.toString(copy));

        int index = Arrays.binarySearch(arr, 40);     //searched for value 40
        System.out.println("Index of 40: " + index);

         int[] arr2 = {70, 20, 30, 35, 60, 80};                // Created a new array arr2 and compared with first
        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));

    }
}

