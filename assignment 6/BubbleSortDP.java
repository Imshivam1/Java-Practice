public class BubbleSortDP {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // DP optimization: Stop early if no swaps are made
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the swapped flag at the beginning of each pass

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // A swap was made
                }
            }

            // If no swaps were made during this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Sorted Array (DP):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
