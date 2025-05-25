public class SimpleLongestSubstring {
    public static int findLongestSubstring(String s) {
        boolean[] seen = new boolean[256]; // Track characters
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (seen[s.charAt(right)]) {
                seen[s.charAt(left++)] = false; // Remove old character
            }
            seen[s.charAt(right)] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length: " + findLongestSubstring(input));
    }
} 