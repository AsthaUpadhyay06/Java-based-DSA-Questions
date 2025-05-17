 import java.util.Arrays;

public class rotatearray {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        if (n <= 1) return; // No rotation needed for empty or single-element arrays
        
        int lastElement = arr[n - 1]; // Store the last element
        
        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = lastElement; // Place the last element at the first position
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        rotateByOne(arr);
        
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}