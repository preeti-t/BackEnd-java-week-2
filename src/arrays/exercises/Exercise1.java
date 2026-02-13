package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array

 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        int[] numbers = { 10, 20, 30, 40, 50 }; // an array of 5 integers.
        
       // Traverse and print elements.
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
      // Find sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
