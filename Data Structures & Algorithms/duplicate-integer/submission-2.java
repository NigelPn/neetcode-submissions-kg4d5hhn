class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set= new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()!=nums.length){
            return true;
        }
        return false;
        
    }
}