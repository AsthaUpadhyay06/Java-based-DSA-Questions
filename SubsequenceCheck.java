 public class SubsequenceCheck {
    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++; // Move in s1 when characters match
            }
            j++; // Always move in s2
        }

        return i == s1.length(); // If we reached the end of s1, it's a subsequence
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";

        System.out.println(isSubsequence(s1, s2)); // Output: true
    }
} 