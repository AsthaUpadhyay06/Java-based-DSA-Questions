 public class StringToInteger {
    public static int myAtoi(String str) {
        str = str.trim(); // Remove spaces
        if (str.isEmpty()) return 0; // If empty, return 0

        int sign = 1, i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') { // Handle sign
            sign = (str.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) { // Read digits
            result = result * 10 + (str.charAt(i) - '0'); // Convert char to digit
            i++;
        }

        return result * sign; // Apply sign
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42")); // Output: 42
        System.out.println(myAtoi("   -42")); // Output: -42
        System.out.println(myAtoi("123abc")); // Output: 123
    }
} 