public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 25, 36, 22, 54, 12, 5}; // Array declaration
        int n = arr.length;

        // Right rotate array by one position
        int last = arr[n - 1]; // Store last element
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0] = last; // Set first element as last stored element

        System.out.print("Rotated Array arr = {");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("};");
    }
}
//output should be arr = {5, 1, 25, 36, 22, 54, 12};
