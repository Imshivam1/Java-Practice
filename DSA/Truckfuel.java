
/*
 Problem statement
You have been given a circular path. There are N petrol pumps on this path that are numbered from 0 to N - 1 (Both inclusive). Each petrol pump has two values associated with it:
1)The amount of petrol that is available at this particular petrol pump.
2)The distance to reach the next petrol pump.
You are on a truck having an empty tank of infinite capacity. You can start the tour from any of the petrol pumps. Your task is to calculate the first petrol pump from where the truck will be able to complete the full circle or determine if it is impossible to do so.
You may assume that the truck will stop at every petrol pump and it will add the petrol from that pump to its tank. The truck will move one kilometre for each litre of petrol consumed.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= N <= 5*10^5
1 <= Amount of petrol on each pump <= 10^9
1 <= Distance to next pump <= 10^9

Where N is the total number of petrol pumps on the circular path.

Time Limit: 1sec
Sample Input 1 :
3
1 5
10 3
3 4
Sample Output 1:
1
Explanation for Sample 1:
If we start from the petrol pump at index 0, we will not be able to travel to index one as petrol available for travelling is less than the distance.

If we start at index 1, we can complete our journey (1 -> 2 -> 0 -> 1) easily. 
Sample Input 2 :
3
1 10
10 20
3 10
Sample Output 2 :
-1
 */
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
