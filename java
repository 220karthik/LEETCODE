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

//move zeros to end && if two numbers are same the multiple by 2

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;  
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                if (count != i) { 
                    nums[i] = 0;
                }
                count++;
            }
        }

        return nums;
    }
}

