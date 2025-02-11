import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class PairSum {
    public static void findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Pairs whose sum is " + target + ":");
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairs(arr, target);
    }
}
