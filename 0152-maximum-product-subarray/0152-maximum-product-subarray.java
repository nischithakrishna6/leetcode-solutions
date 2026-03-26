class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < n; i++) {
 
            leftProduct = (leftProduct == 0 ? 1 : leftProduct) * nums[i];

            rightProduct = (rightProduct == 0 ? 1 : rightProduct) * nums[n - 1 - i];

            result = Math.max(result, Math.max(leftProduct, rightProduct));
        }

        return result;
    }
}

        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxProd;

            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(tempMax * nums[i], minProd * nums[i]));

            result = Math.max(result, maxProd);
        }

        return result;
    }
}