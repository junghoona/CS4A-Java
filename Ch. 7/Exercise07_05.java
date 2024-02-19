import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] list = new int [10];
        int[] distinct = new int [10];
        int num;
        int counter = 0;
        
        // Prompt user for input
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < list.length; i++) {
            num = stdin.nextInt();
            list[i] = num;
        }
        
        // Processing
        for (int i = 0; i < list.length; i++) {
            boolean found = false;
            for (int j = 0; j < counter; j++) {
                if (list[i] == distinct[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct[counter++] = list[i];
            }
        }
        
        System.out.println("The number of distinct integers is" + counter);
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i]);
        }
    }
}
