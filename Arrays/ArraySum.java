class Solution {

    // Function to get sum of array elements
    int sum(int arr[], int n) {

        int ans = 0;

        // Traverse the array
        for(int i = 0; i < n; i++) {
            ans = ans + arr[i];
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 8};
        int n = arr.length;

        Solution sol = new Solution();

        int result = sol.sum(arr, n);

        System.out.println("The sum of array elements is: " + result);
    }
}
