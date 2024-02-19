import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int [] counts = new int [100];

        // Prompt user for number input
        System.out.print("Enter the integers between 1 and 100: ");
        int num;
        do {
            num = stdin.nextInt();
            if (num > 0 && num <= 100) {
                counts[num - 1]++;
            }
        } while (num != 0);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                if (counts[i] > 1) {
                    System.out.println((i + 1) + " occurs " + counts[i] + " times");
                } else {
                    System.out.println((i + 1) + " occurs " + counts[i] + " time");
                }
            }
        }
    }
}
