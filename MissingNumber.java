import java.util.Scanner;
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int N) {
        int sumTotal = N * (N + 1) / 2;
        int sumArray = 0;
        for (int num : arr) {
            sumArray += num;
        }
        return sumTotal - sumArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (size of the sequence): ");
        int N = scanner.nextInt();
        System.out.print("Enter the number of elements in the array (N-1): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (without the missing number):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int missingNumber = findMissingNumber(arr, N);
        System.out.println("The missing number is: " + missingNumber);
    }
}
