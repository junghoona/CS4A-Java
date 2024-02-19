import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = stdin.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        double firstSum = 0;
        double secondSum = 0;
        double thirdSum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
                firstSum += m[i][0];
                secondSum += m[i][1];
                thirdSum += m[i][2];
            }
        }
        if (firstSum != 1 || secondSum != 1 || thirdSum != 1) {
            return false;
        }
        return true;
    }
}


// An n by n matrix is called a 
// positive Markov matrix 
// if each element is positive 
// and the sum of the elements in each column is 1. 

// Write the following method to check whether 
// a matrix is a Markov matrix.