class Solution {
    public int[] getConcatenation(int[] nums) {
        int numConca = 2;
        int[] ans = new int[nums.length * numConca];
        int idx = 0;
        for (int i = 0 ; i < numConca ; i ++ ){
            for (int num : nums){
                ans[idx++] =  num;
            }
        }

        
        return ans;
    }
}