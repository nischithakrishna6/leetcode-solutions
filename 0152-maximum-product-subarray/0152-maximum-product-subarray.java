class Solution {
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