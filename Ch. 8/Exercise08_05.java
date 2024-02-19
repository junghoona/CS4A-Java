import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = stdin.nextDouble();
            }
        }

        System.out.println("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = stdin.nextDouble();
            }
        }
        double[][] matrix3 = new double[3][3];

        matrix3 = addMatrix(matrix1, matrix2);
        printResult(matrix1, matrix2, matrix3);
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrix;
    }

    public static void printResult(
        double[][] m1, double[][] m2, double[][] m3
    ) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j]);
                if (i == 1 && j == 2) {
                    System.out.print(" + ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j]);
                if (i == 1 && j == 2) { 
                    System.out.print(" = ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j]);
            }
            System.out.println("");
        }
    }
}
