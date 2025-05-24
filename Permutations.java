 public class Permutations {
    public static void permute(String str, String result) {
        if (str.isEmpty()) { // Base case: when no characters are left, print result
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permute("abc", ""); // Try with "abc"
    }
} 