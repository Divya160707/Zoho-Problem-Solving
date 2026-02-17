import java.util.Scanner;

public class InbuiltMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= s1.length())
            System.out.println("Substring: " + s1.substring(start, end));

        sc.nextLine();

        System.out.print("Enter word/char to search: ");
        String key = sc.nextLine();

        System.out.println("Index: " + s1.indexOf(key));
    }
}
