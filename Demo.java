class Demo {
    int a; // Variable declaration
    int b;

    void show() { // Method declaration
        System.out.print(a + " " + b); // Print variables
    }

    public static void main(String[] args) { // Main method
        Demo d = new Demo(); // Create Demo object
        d.a = 6;             // Assign values to variables
        d.b = 12;
        d.show();            // Call the show method
    }
}
