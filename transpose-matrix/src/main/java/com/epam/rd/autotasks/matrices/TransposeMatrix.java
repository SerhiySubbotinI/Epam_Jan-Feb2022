package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int count = 0;
            for(int l = 0; l < matrix[0].length;l++)
            {count++;
        }

        int matrix2[][] = new int[count][matrix.length];

        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0; j < matrix.length; j++)
                matrix2[i][j] = matrix[j][i];
            return matrix2;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] matrix = {
                {1, 2, 7},
                {7, -13, 8},
                {5, 8, 8},
                {10, 4, 9}};

        int[][] result = transpose(matrix);

        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
