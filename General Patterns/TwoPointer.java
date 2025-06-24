// Initialize the left pointer to the beginning of the array
// Initialize the right pointer to the end of the array
// Continue as long as the left pointer is less than the right pointer
// Perform some operation using the elements at the left and right pointers
// Check if our condition is satisfied
// Move left and right pointer as needed.
// After while loop, handle case where no solution is found in the while loop.

public class TwoPointer {
    public static void twoPointerFunction(int[] arr, int target) {
        // Initialize the left pointer to the beginning of the array
        int left = 0;

        // Initialize the right pointer to the end of the array
        int right = arr.length - 1;

        // Continue as long as the left pointer is less than the right pointer
        while (left < right) {
            // Perform some operation using the elements at the left and right pointers
            int sum = arr[left] + arr[right];

            // Check if our condition is satisfied
            if (sum == target) {
                System.out.println("Found target at indices: " + left + " and " + right);
            } else if (sum < target) {
                // If the sum is less than the target, we need a larger value,
                // so move the left pointer to the right.
                left++;
            } else { // sum > target
                // If the sum is greater than the target, we need a smaller value,
                // so move the right pointer to the left.
                right--;
            }
        }

        // Optional: Handle the case where no solution is found
        if (left >= right) {
            System.out.println("Target not found using two pointers.");
        }
    }
}
