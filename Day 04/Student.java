import java.util.Scanner;

public class Student {

    int mark1, mark2, mark3;
    double average;

    void setMarks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculateAverage() {
        average = (mark1 + mark2 + mark3) / 3.0;
    }

    void printResult() {
        System.out.println("Average Marks: " + average);

        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter mark 1:");
        int m1 = sc.nextInt();

        System.out.println("Enter mark 2:");
        int m2 = sc.nextInt();

        System.out.println("Enter mark 3:");
        int m3 = sc.nextInt();

        s.setMarks(m1, m2, m3);
        s.calculateAverage();
        s.printResult();
    }
}
