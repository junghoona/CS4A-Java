import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        // Initialize Scanner obj
        Scanner stdin = new Scanner(System.in);
        int SIZE;

        // Prompt user input
        System.out.print("Enter the size of the list: ");
        SIZE = stdin.nextInt();

        int [] list = new int [SIZE];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < SIZE; i++) {
            int num = stdin.nextInt();
            list[i] = num;
        }

        System.out.print("The list has " + SIZE + " integers ");
        for (int num: list) {
            System.out.print(num + " ");
        }

        boolean sorted = isSorted(list);
        if (sorted) {
            System.out.print("\nThe list is already sorted");
        } else {
            System.out.print("\nThe list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i + 1] < list[i]) {
                return false;
            }
        }
        return true;
    }
}
