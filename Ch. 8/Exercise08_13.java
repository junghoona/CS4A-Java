import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array: ");
        int row = stdin.nextInt();
        int col = stdin.nextInt();

        System.out.println("Enter the array: ");
        double[][] matrix = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = stdin.nextDouble();
            }
        }

        int[] coordinates = locateLargest(matrix);
        System.out.println(
            "The location of the largest element is at (" + coordinates[0] + ", " + coordinates[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int row = 0;
        int col = 0;
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
}
