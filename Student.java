import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Student {
    private String name;
    private Date dob;

    public Student(String name, String dobStr) throws Exception {
        this.name = name;
        // Accepts both DD-MM-YYYY and YYYY-MM-DD
        if (dobStr.contains("-") && dobStr.length() == 10) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            try {
                this.dob = sdf1.parse(dobStr);
            } catch (Exception e) {
                this.dob = sdf2.parse(dobStr);
            }
        } else {
            throw new Exception("Invalid date format");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        long diffInMillies = Math.abs(new Date().getTime() - dob.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int) (diffInDays / 365);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter DOB (DD-MM-YYYY or YYYY-MM-DD): ");
        String dob = sc.nextLine();

        Student s = new Student(name, dob);
        s.displayStudentInfo();
    }
}
