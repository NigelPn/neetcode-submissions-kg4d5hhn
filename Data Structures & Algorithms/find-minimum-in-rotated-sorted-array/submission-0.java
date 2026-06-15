class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = 0;

        if(nums[l]<nums[r]){
            return nums[l];
        }


        while (l < r){
            int midpoint = l + ((r-l)/2);
            if (nums[midpoint] >= nums[r]){
                l = midpoint + 1;
            }else{
                r = midpoint ;
            }
        }
        return nums[l];
    }
}
