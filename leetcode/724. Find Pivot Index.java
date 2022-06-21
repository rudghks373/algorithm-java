class Solution {
    public int pivotIndex(int[] nums) {
        int right = 0;
        int left = 0;
        for(int num : nums){
            right += num;
        }
        for(int i = 0; i< nums.length; i++){
            right -= nums[i];
            if (i > 0) left += nums[i-1];
            if (right == left ) return i;
        }
        
        return -1;
    }
}
