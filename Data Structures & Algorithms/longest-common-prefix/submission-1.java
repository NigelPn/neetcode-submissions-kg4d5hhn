class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int x = 0; x < strs[0].length();x++){
            for(String str:strs){
                if (x == str.length() || str.charAt(x) != strs[0].charAt(x)){
                    return str.substring(0,x);
                }
            }
        }
        return strs[0];
    }
}