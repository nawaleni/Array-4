/*
T: O(n log n) -> sort
S: O(1) - in place
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        //invalid check
        if(nums == null || nums.length == 0) return -1;
        
        //sort the array and just sum up alternate elements
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i+2){
            sum += nums[i];
        }
        return sum;
    }
}