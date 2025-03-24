
public class Truckfuel {
    public static int firstCircularTour(int[] petrol, int[] distance, int n) {
        // Edge case: If n is invalid
        if (n <= 0 || petrol == null || distance == null) {
            return -1; 
        }
        
        // Check if petrol and distance arrays are of valid length
        if (petrol.length != n || distance.length != n) {
            throw new IllegalArgumentException("Input arrays must be of length " + n);
        }

        int totalSurplus = 0;  // Total fuel balance to check if completion is possible
        int currSurplus = 0;   // Running balance for checking valid start index
        int startIndex = 0;    // The index where we should start

        for (int i = 0; i < n; i++) {
            // Validate inputs to be non-negative
            if (petrol[i] < 0 || distance[i] < 0) {
                throw new IllegalArgumentException("Petrol and distance values must be non-negative");
            }

            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currSurplus += balance;

            // If at any point currSurplus goes negative, reset the starting index
            if (currSurplus < 0) {
                startIndex = i + 1;
                currSurplus = 0;  // Reset current balance for the next potential start point
            }
        }

        // If totalSurplus is negative, journey is impossible
        return (totalSurplus >= 0) ? startIndex : -1;
    }

    public static void main(String[] args) {
        // Sample test cases
        int[] petrol1 = {1, 10, 3};
        int[] distance1 = {5, 3, 4};
        System.out.println(firstCircularTour(petrol1, distance1, 3)); // Output: 1

        int[] petrol2 = {1, 10, 3};
        int[] distance2 = {10, 20, 10};
        System.out.println(firstCircularTour(petrol2, distance2, 3)); // Output: -1
    }
}
