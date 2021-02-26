/*
T - O(n)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int max = nums[0];
        int curSum = nums[0];
        int start = 0;
        int end = 0;
        
        int localS = 0;
        
        for(int i = 1; i < nums.length; i++){
            curSum += nums[i];
            if(nums[i] > curSum){
                localS = i;
                curSum = nums[i];
            }
            //curSum = Math.max(curSum + nums[i], nums[i]);
            
            if(max < curSum){
                start = localS;
                end = i;
                max = curSum;
            }
            //max = Math.max(max, curSum);
        }
        System.out.println(start+ " " + end);
        return max;
    }
}