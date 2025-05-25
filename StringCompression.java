public class StringCompression {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aabbccc";
        System.out.println("Compressed output: " + compress(input));
    }
} 