class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans = 0;
        HashMap<Character, Integer> charToPositionMap = new HashMap<>();

        for(int r = 0; r < s.length();r++){
            if (charToPositionMap.containsKey(s.charAt(r))){
                l = Math.max(charToPositionMap.get(s.charAt(r)) + 1, l);
            }
            charToPositionMap.put(s.charAt(r),r);
            ans = Math.max(ans,r - l + 1);
        }
        return ans;
    }
}
