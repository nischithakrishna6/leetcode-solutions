class Solution {
    public int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int bigProfit = 0;
        for (int i = 0; i< nums.length;i++){
            if(nums[i] < minPrice){
                minPrice = nums[i];
            }
            else{
                int profit = nums[i] - minPrice;
                bigProfit = Math.max(bigProfit, profit);
            }
        }
        return bigProfit;
    }
}