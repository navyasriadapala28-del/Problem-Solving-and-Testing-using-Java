import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Sort the array
        Arrays.sort(arr);

        // Check if k is valid
        if (k > 0 && k <= n) {
            System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }

        sc.close();
    }
}