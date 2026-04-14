class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for (int x =0 ; x < t.length(); x ++){
            hashMapS.put(s.charAt(x),hashMapS.getOrDefault(s.charAt(x),0)+1);
            hashMapT.put(t.charAt(x),hashMapT.getOrDefault(t.charAt(x),0)+1);
        }

        return hashMapS.equals(hashMapT);
    }

}
