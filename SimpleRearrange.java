import java.util.Arrays;

public class SimpleRearrange {
    public static void main(String[] args) {
        int[] arr = {3, -2, -5, 7, 1, -8, 4, -6};
        int[] result = new int[arr.length];
        int index = 0;

        // Move negative numbers first
        for (int num : arr) {
            if (num < 0) {
                result[index++] = num;
            }
        }

        // Move positive numbers next
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        System.out.println("Rearranged array: " + Arrays.toString(result));
    }
}