 import java.util.ArrayList;

public class LeadersInArray {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1]; // Rightmost element is always a leader
        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders in the array:");
        findLeaders(arr);
    }
} 
