public class RotateArrayByOne {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];  // Store the last element

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;  // Place last element at the first position
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateByOne(arr);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
} 