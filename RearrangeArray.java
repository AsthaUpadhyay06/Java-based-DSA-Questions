import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeNumbers(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array
        int index = 0;

        // First, add all negative numbers to temp array
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;
            }
        }

        // Then, add all positive numbers to temp array
        for (int num : arr) {
            if (num >= 0) {
                temp[index++] = num;
            }
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {3, -7, 4, -2, -8, 5, -1, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));

        rearrangeNumbers(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}