import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = stdin.nextInt();
        
        double[] scores = new double[numStudents];
        double bestScore = 0;
        
        System.out.printf("Enter %d scores: ", numStudents);
        
        for (int i = 0; i < scores.length; i++) {
            scores[i] = stdin.nextDouble();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
        
        char grade;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10) {
                grade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}
