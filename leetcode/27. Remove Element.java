class Solution {
    public int removeElement(int[] nums, int val) {
        int available = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[available++] = nums[i];
            }
        }
        return available;
    }
}
