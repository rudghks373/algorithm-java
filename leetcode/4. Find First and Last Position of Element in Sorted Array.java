class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }
    
    private int findFirst(int[] nums, int target){
        int result = -1;
        int frist = 0;
        int last = nums.length-1;
        while(frist <= last){
            int mid = (last + frist) / 2;
            if(nums[mid] < target){
                frist = mid + 1;
            }else{
                last = mid - 1;
            }
            if(nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    
    private int findLast(int[] nums, int target){
        int result = -1;
        int frist = 0;
        int last = nums.length-1;
        while(frist <= last){
            int mid = (last + frist) / 2;
            if(nums[mid] <= target){
                frist = mid + 1;
            }
            else{
                last = mid - 1;
            }
            if(nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
}
