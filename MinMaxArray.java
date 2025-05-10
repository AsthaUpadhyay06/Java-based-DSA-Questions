public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5, 1, 8};

        // Initialize min and max with first array element
        int min = numbers[0];
        int max = numbers[0];

        // Traverse the array to find min and max
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}