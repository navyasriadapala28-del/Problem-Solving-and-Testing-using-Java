import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N
        int n = sc.nextInt();

        // Read first element
        int currentSum = sc.nextInt();
        int maxSum = currentSum;

        // Kadane's Algorithm
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();

            currentSum = Math.max(value, currentSum + value);
            maxSum = Math.max(maxSum, currentSum);
        }

        // Print maximum subarray sum
        System.out.println(maxSum);

        sc.close();
    }
}