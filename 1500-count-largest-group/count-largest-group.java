class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; // To hold frequency of each digit sum
        int c = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }

        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                c++;
            }
        }

        return c;
    }
}
