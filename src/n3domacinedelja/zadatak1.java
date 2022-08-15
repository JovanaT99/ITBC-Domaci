package n3domacinedelja;

import java.util.Arrays;
import java.util.Stack;

public class zadatak1 {

    public static void main(String[] args) {

        int[][] matrix = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};

        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];

            }
            if (maxSum < sum) {
                maxSum = sum;
                index = i;

            }
        }
        System.out.println(Arrays.toString(matrix[index]));

    }
}
