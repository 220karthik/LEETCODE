//shares profit

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}

//moving zeros
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pointer = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] != 0){
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        for(int i = pointer ; i< n; i++){
            nums[i] = 0;

        }
        
    }
}
