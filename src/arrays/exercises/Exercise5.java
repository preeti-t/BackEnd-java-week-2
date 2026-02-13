package arrays.exercises;

import java.util.Scanner;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
public class Exercise5
{
    public static void main(String[] args)
    {
        int[] arr = { 10, 20, 13, 40, 35, 29 }; //Created an array of integers

        Scanner scanner = new Scanner(System.in); // Value asked from the user

        System.out.print("Enter a number: ");
        int key = scanner.nextInt();

        System.out.println("You entered: " + key);

        scanner.close();
         
        int index = -1;                         // Implemented linear search.
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1)                                          // Printed index if found or "Not found".
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
