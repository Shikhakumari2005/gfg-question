
import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " | " + name + " | " + marks;
    }
}

public  class StudentRecordSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, marks);
        students.add(s);
        System.out.println("Student added");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.id == id) {
                students.remove(i);
                found = true;
                System.out.println("Student deleted!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Not found!");
    }

    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No records.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1-> Add Student");
            System.out.println("2-> Delete Student");
            System.out.println("3-> Search Student");
            System.out.println("4-> Display All Students");
            System.out.println("5-> Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) addStudent();
            else if (choice == 2) deleteStudent();
            else if (choice == 3) searchStudent();
            else if (choice == 4) displayAll();
            else if (choice == 5) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
