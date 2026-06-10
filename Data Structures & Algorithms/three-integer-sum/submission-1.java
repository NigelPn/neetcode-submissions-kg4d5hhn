class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int x = 0; x < nums.length; x ++){
            if (nums[x] > 0) break;
            if (x > 0 && nums[x] == nums[x - 1]) continue ;

            int l = x+1;
            int r = nums.length - 1 ;
        
            while( r > l){
                int sum = nums[x] + nums[l] + nums[r];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[x], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return ans;
    }
}
