 public class StringRotationCheck {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false; // Lengths must be equal

        String combined = s1 + s1; // Double the original string
        return combined.contains(s2); // Check if rotated string exists
    }

    public static void main(String[] args) {
        String original = "waterbottle";
        String rotated = "erbottlewat";

        System.out.println(isRotation(original, rotated)); // Output: true
    }
}