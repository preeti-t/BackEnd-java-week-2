package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // Create a 2x3 array
        int[][] matrix = new int[2][3];

        // Assign values
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        //  Traverse and print matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {          // iterate rows
            for (int j = 0; j < matrix[i].length; j++) {   // iterate columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }

        //  Calculate sum of elements
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
