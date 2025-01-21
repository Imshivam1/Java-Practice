public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};

        // Find largest and smallest
        int largest = arr[0], smallest = arr[0], sum = 0;

        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Average: " + average);
    }
}
