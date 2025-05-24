 public class RemoveDuplicates {
    public static String removeDuplicateChars(String str) {
        String result = ""; // Start with an empty result string
        for (char c : str.toCharArray()) { // Loop through each character
            if (!result.contains(c + "")) { // If character is not in result, add it
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("programming")); // Test the function
    }
} 