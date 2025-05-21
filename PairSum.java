
    import java.util.HashMap;

public class PairSum {
    public static void findPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}

