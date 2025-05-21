 public class CountOccurrences{
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 4};
        int target = 2;
        System.out.println("Element " + target + " occurs " + countOccurrences(arr, target) + " times.");
    }
}