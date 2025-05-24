 public class LongestCommonPrefix {
    public static String findPrefix(String[] words) {
        if (words.length == 0) return ""; // If no words, return empty string

        String prefix = words[0]; // Start with the first word

        for (int i = 1; i < words.length; i++) {
            while (!words[i].startsWith(prefix)) { // Reduce prefix until it matches all words
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return ""; // If no common prefix, return empty string
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(findPrefix(words)); // Output: "fl"
    }
}