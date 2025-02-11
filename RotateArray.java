import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the array elements separated by space:");
        String[] inputArray = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        
        System.out.print("Enter number of positions to rotate: ");
        int positions = scanner.nextInt();
        
        System.out.print("Enter direction (Left or Right): ");
        String direction = scanner.next();
        
        if (direction.equalsIgnoreCase("Left")) {
            rotateLeft(array, positions);
        } else if (direction.equalsIgnoreCase("Right")) {
            rotateRight(array, positions);
        } else {
            System.out.println("Invalid direction!");
            return;
        }
        
        System.out.println("Rotated Array: " + Arrays.toString(array));
        scanner.close();
    }

    public static void rotateLeft(int[] array, int positions) {
        int length = array.length;
        positions = positions % length;
        reverse(array, 0, positions - 1);
        reverse(array, positions, length - 1);
        reverse(array, 0, length - 1);
    }

    public static void rotateRight(int[] array, int positions) {
        int length = array.length;
        positions = positions % length;
        reverse(array, 0, length - positions - 1);
        reverse(array, length - positions, length - 1);
        reverse(array, 0, length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

