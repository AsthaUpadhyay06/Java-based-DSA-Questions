 public.java
  class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProd = nums[0], minProd = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap max and min when encountering a negative number
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr)); // Output: 6
    }
} 