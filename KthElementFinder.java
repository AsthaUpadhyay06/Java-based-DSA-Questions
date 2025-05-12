 import java.util.Arrays;

public class KthElementFinder {
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr); // Sorts the array in ascending order
        return arr[k - 1]; // kth smallest element
    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sorts the array in ascending order
        return arr[arr.length - k]; // kth largest element
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // Example kth position

        System.out.println("Kth smallest element: " + findKthSmallest(arr, k));
        System.out.println("Kth largest element: " + findKthLargest(arr, k));
    }
} 