public class StudentCourse {

    // Course class
    static class Course {
        String courseName;
        int marks;

        Course(String courseName, int marks) {
            this.courseName = courseName;
            this.marks = marks;
        }
    }

    // Student class
    static class Student {
        String name;
        String program;
        int semester;
        Course[] courses;

        Student(String name, String program, int semester, Course[] courses) {
            this.name = name;
            this.program = program;
            this.semester = semester;
            this.courses = courses;
        }

        void displayStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Program: " + program);
            System.out.println("Semester: " + semester);
            System.out.println("Courses Registered:");
            for (Course c : courses) {
                System.out.println(" - " + c.courseName);
            }
        }

        void displayLowScoreCourses() {
            System.out.println("Courses with marks less than 40:");
            for (Course c : courses) {
                if (c.marks < 40) {
                    System.out.println(" - " + c.courseName + " (" + c.marks + " marks)");
                }
            }
        }
    }

    public static void main(String[] args) {
        Course[] courseList = {
            new Course("Mathematics", 35),
            new Course("Computer Science", 85),
            new Course("Physics", 38)
        };

        Student s = new Student("Tanushree", "B.Tech CSE", 5, courseList);

        s.displayStudentInfo();
        System.out.println("------------------");
        s.displayLowScoreCourses();
    }
}
