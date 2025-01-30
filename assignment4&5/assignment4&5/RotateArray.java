import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to rotate: ");
        int d = sc.nextInt();
        int[] arr = {1, 25, 36, 22, 54, 12, 5}; // Array declaration
        int n = arr.length;

        for(int j=0; j<d; j++){//d times rotation
        // Right and left rotate array by one position
        int first = arr[0]; // Store last element
        for (int i = 0; i <n-1; i++) {
            arr[i] = arr[i + 1]; // Shift elements to the right
        }
        arr[n-1] = first; // Set first element as last stored element
        }

        System.out.print("Rotated Array arr = {");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("};");
    }
}
//output should be arr = {5, 1, 25, 36, 22, 54, 12}; if rotation is right

//output should be arr = {25, 36, 22, 54, 12, 5, 1}; if rotation is left
/*
{1, 25, 36, 22, 54, 12, 5}
3 times rotation
{22, 54, 12, 5, 1, 25, 36}
*/