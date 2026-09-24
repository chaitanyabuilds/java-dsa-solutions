
public class MaxSubarraySum {

    // 1. BRUTE FORCE APPROACH
    public static void bruteForce(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;
                int currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Brute Force Max Sum = " + maxSum);
    }


    // 2. PREFIX SUM APPROACH
    public static void prefixSum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Create prefix array
        int prefix[] = new int[numbers.length];

        // Store first element
        prefix[0] = numbers[0];

        // Calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                // Calculate current subarray sum
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                // Update maximum sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Prefix Sum Max Sum = " + maxSum);
    }


    // 3. KADANE'S ALGORITHM
    public static void kadanes(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {

            // Add current element
            cs = cs + numbers[i];

            // Reset if current sum becomes negative
            if (cs < 0) {
                cs = 0;
            }

            // Update maximum sum
            if (cs > ms) {
                ms = cs;
            }
        }

        System.out.println("Kadane's Max Sum = " + ms);
    }


    // MAIN METHOD
    public static void main(String[] args) {

        int numbers[] = {2, 4, -6, 8, 10};

        bruteForce(numbers);
        prefixSum(numbers);
        kadanes(numbers);
    }
}