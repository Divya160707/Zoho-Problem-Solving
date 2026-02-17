import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            return;
        }

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copying array
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
