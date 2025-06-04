public class PersonEmployee {

    // Person class
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        void displayName() {
            System.out.println("Name: " + name);
        }

        void displayAge(String dob) {
            int birthYear = 0;
            int currentYear = 2025;

            if (dob.contains("-")) {
                String[] parts = dob.split("-");
                if (dob.charAt(2) == '-') { // DD-MM-YYYY
                    birthYear = Integer.parseInt(parts[2]);
                } else { // YYYY-MM-DD
                    birthYear = Integer.parseInt(parts[0]);
                }
            }

            int age = currentYear - birthYear;
            System.out.println("Age: " + age);
        }
    }

    // Employee class inheriting from Person
    static class Employee extends Person {
        int empId;
        double salary;

        Employee(String name, int empId, double salary) {
            super(name);
            this.empId = empId;
            this.salary = salary;
        }

        void displayEmployeeDetails() {
            displayName();
            System.out.println("Employee ID: " + empId);
            System.out.println("Salary: ₹" + salary);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Person
        Person p = new Person("Tanushree");
        p.displayName();
        p.displayAge("12-06-2000"); // or "2000-06-12"

        System.out.println("---------------");

        // Employee
        Employee e = new Employee("Tanus", 102, 50000.0);
        e.displayEmployeeDetails();
        e.displayAge("2000-06-12");
    }
}
