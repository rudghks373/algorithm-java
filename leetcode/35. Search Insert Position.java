class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int mid = (i + j) / 2;
            int getNum = nums[mid];
            if(getNum == target){
                return mid;
            }
            else if(getNum > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return i;
    }
}
