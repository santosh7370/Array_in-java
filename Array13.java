//Binary Search for program in java 
// based on assending order.
import java.util.Scanner;

public class Array13 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {12, 13, 14, 15, 21, 23, 25, 31, 32, 32, 34, 42};
        System.out.println("Enter element for finding in Array list");
        Scanner sn = new Scanner(System.in);
        int key = sn.nextInt();
        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}
