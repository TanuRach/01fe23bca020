import java.util.Scanner;

public class StudentCourses {
    public void displayCourses() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter semester number: ");
        int semester = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Semester " + semester + " ---");
        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + ": " + marks[i] + " marks");
        }
    }

    public static void main(String[] args) {
        StudentCourses sc = new StudentCourses();
        sc.displayCourses();
    }
}
