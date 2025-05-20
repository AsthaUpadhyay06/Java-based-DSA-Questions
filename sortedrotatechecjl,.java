class SortedRotatedCheck {
    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int countBreaks = 0; // Count of order breaks
        
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                countBreaks++; // Break in sorted order
            }
        }
        
        // Check last and first element for rotation validation
        if (arr[n - 1] > arr[0]) {
            countBreaks++;
        }
        
        return (countBreaks == 1); // Only one break means sorted & rotated
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2}; // Example input
        System.out.println("Is sorted and rotated? " + isSortedAndRotated(arr));
    }
}
    