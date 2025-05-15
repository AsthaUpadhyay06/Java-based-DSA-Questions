
     import java.util.*;

public class Main {
    public static void union(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < arr1.length) System.out.print(arr1[i++] + " ");
        while (j < arr2.length) System.out.print(arr2[j++] + " ");
    }

    public static void intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) i++;
            else if (arr1[i] > arr2[j]) j++;
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("Union:");
        union(arr1, arr2);
        System.out.println("\nIntersection:");
        intersection(arr1, arr2);
    }
}
    

