import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the array size (size should <=100):");
            int size = scanner.nextInt();
            int a[] = new int[size];
            if (size > 100) {
                System.out.println("Array size must not exceed 100.");
                return;
            } else {
                System.out.println("Enter the elements");
                for (int i = 0; i < size; i++) {
                    a[i] = scanner.nextInt();
                }
                Arrays.sort(a, 0, size);

                for (int i = 0; i < size; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println("\nEnter the sum required");
                int sum = scanner.nextInt();
                int i = 0, j = size - 1, count = 0;
                while (i < j) {
                    if (a[i] + a[j] == sum) {
                        System.out.println("Pair: " + a[i] + " and " + a[j]);
                        count++;
                        i++;
                        j--;
                    } else if (a[i] + a[j] > sum) {
                        j--;
                    } else {
                        i++;
                    }
                }
                if (count == 0) {
                    System.out.println("The number required to produce sum is not present");
                } else {
                    System.out.println("Total Pairs: " + count);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
    }

}

