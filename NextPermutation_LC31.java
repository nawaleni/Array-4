//1576543
//1675543
//1634557

/*
T - O(n)
S - O(1)
*/
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        
        //Step 1: find 1st breach 
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        
        //step 2: find the element just greter than nums[i] and swap with it
        //skip step 2 if i becomes -ve
        if(i >= 0){
            int j = n - 1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        
        //Step 3: reverse the elements from i to end of the array
        reverse(nums, i+1, n-1);
    }
    
    
    private void reverse(int[] nums, int l, int h){
        while(l < h){
            swap(nums, l, h);
            l++; h--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}