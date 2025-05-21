 import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy remaining elements of arr2 if any
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0}; // Extra space for arr2
        int[] arr2 = {2, 4, 6};
        int m = 4, n = 3;

        merge(arr1, arr2, m, n);
        System.out.println(Arrays.toString(arr1)); // Output: [1, 2, 3, 4, 5, 6, 7]
    }
} 