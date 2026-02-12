import java.util.Scanner;

public class CountVowels {

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            String ch = String.valueOf(str.charAt(i));

            if (ch.equalsIgnoreCase("a") ||
                ch.equalsIgnoreCase("e") ||
                ch.equalsIgnoreCase("i") ||
                ch.equalsIgnoreCase("o") ||
                ch.equalsIgnoreCase("u")) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int result = countVowels(input);

        System.out.println("Number of vowels: " + result);
    }
}
