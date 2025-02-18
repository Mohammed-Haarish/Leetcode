import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        // Find the smallest and largest element in the array
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        
        // Calculate the GCD of the minimum and maximum numbers
        return gcd(min, max);
    }

    // Helper method to calculate the GCD using the Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
