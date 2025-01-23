public class Student {
    final private String name;
    final private int rollNumber;

    // Constructor using 'this'
    public Student(String name, int rollNumber) {
        this.name = name; // Referring to the instance variable
        this.rollNumber = rollNumber;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + this.name + ", Roll Number: " + this.rollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        student.display();
    }
}
