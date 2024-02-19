import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double [] list = new double [10];
        double mean;
        double stdDeviation;
        
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            double num = stdin.nextDouble();
            list[i] = num;
        }
        
        mean = mean(list);
        stdDeviation = deviation(list);
        
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + stdDeviation);
    }
    
    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double deviation = 0;
        
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    
    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        double mean;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        mean = sum / x.length;
        return mean;
    }
}
