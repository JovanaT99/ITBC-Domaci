package RazniZadaciCas;

public class vezbamatrica {

    public static void main(String[] args) {

        int row, cols;

        int a[][] = {
                {4, 5, 6},
                {3, 4, 1},
                {1, 2, 3}
        };

        int b[][] = {
                {2, 0, 3},
                {2, 3, 1},
                {1, 1, 1}
        };

        row = a.length;
        cols = a[0].length;

        int[][] res = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = a[i][j] - b[i][j];
                //System.out.println(res[i][j]);

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }
    }
}
