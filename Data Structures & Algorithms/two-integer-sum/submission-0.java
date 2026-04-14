class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> valueToIndexHash= new HashMap <>();

        for (int i=0;i < nums.length;i++){
           int currVal = nums[i];
           int diff = target - currVal;
           if (valueToIndexHash.containsKey(diff)){
            return new int[] {valueToIndexHash.get(diff),i};
           }
           valueToIndexHash.put(currVal,i);
        }
        return new int[] {};
    }
}
