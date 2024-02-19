import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = stdin.nextDouble();
            }
        }

        double firstColSum = sumColumn(matrix, 0);        
        double secondColSum = sumColumn(matrix, 1);
        double thirdColSum = sumColumn(matrix, 2);
        double fourthColSum = sumColumn(matrix, 3);

        System.out.println("Sum of the element at column 0 is " + firstColSum);
        System.out.println("Sum of the element at column 1 is " + secondColSum);
        System.out.println("Sum of the element at column 2 is " + thirdColSum);
        System.out.println("Sum of the element at column 3 is " + fourthColSum);
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
