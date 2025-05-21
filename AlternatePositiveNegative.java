 import java.util.ArrayList;

public class AlternatePositiveNegative {
    public static void rearrange(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        // Merge back in alternating order
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        // Append remaining elements
        while (i < pos.size()) arr[k++] = pos.get(i++);
        while (j < neg.size()) arr[k++] = neg.get(j++);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);

        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
} 
