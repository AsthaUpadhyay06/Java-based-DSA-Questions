public class CountAndSay {
    public static String countAndSay(int n) {
        String result = "1"; // Start with "1"

        for (int i = 1; i < n; i++) {
            String temp = "";
            int count = 1;

            for (int j = 0; j < result.length(); j++) {
                if (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                    count++; // Count consecutive same digits
                } else {
                    temp += count + "" + result.charAt(j); // Add count and digit
                    count = 1; // Reset count
                }
            }

            result = temp; // Update result for next iteration
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5)); // Example: Find the 5th term
    }
} 