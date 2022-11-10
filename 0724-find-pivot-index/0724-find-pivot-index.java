class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        
        for(int i=0; i<nums.length; i++) {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i != 0)
                leftSum += nums[i - 1];
            
            if(totalSum - leftSum - nums[i] == leftSum) {
                return i;
            }
        }
        return -1;
    }
}


//total_sum = 28
// [1,7,3,6,5,6] 

// left_sum = 11
// [1, 7, 3, 6, 5, 6];

// 28 - 11 = 17 - 6 = 11 == 11
    
// total_sum - left_sum - nums[i] == left_sum
