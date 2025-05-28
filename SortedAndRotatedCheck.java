public class SortedAndRotatedCheck {
    public static boolean isSortedAndRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {2, 1, 3, 4, 5};

        System.out.println("Is arr1 sorted and rotated? " + isSortedAndRotated(arr1)); // true
        System.out.println("Is arr2 sorted and rotated? " + isSortedAndRotated(arr2)); // true
        System.out.println("Is arr3 sorted and rotated? " + isSortedAndRotated(arr3)); // false
    }
}