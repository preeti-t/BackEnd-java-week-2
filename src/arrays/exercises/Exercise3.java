package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
         int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2, 3};
        jagged[1] = new int[]{4, 5};
        jagged[2] = new int[] { 6 };
        int sum = 0;

        for (int i = 0; i < jagged.length; i++)
        {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
                sum = sum + jagged[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
