public class StrStrExample {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // If needle is empty, return 0

        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) { // Loop through haystack
            if (haystack.startsWith(needle, i)) return i; // Check if needle starts here
        }

        return -1; // If not found, return -1
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // Output: 2
        System.out.println(strStr("abc", "d")); // Output: -1
    }
} 