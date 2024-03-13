import java.util.Arrays;

public class Q7_2d_array {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        // Initialize the matrix with some values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Use the Arrays class to print the matrix
        System.out.println("Matrix using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(matrix));
    }
}