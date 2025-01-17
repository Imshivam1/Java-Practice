class Student {
    String name;
    int rollNumber;
    int marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'F';
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();

        // Assign values
        student.name = "John Doe";
        student.rollNumber = 101;
        student.marks = 85;

        // Display details and grade
        student.displayDetails();
        System.out.println("Grade: " + student.calculateGrade());
    }
}

/*RESULT
V
*/