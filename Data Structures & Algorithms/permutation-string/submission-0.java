class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        HashMap<Character,Integer> s1Map = new HashMap<>();
        HashMap<Character,Integer> s2Map = new HashMap<>();

        for(int i = 0 ;i < s1.length(); i++){
            s1Map.put(
                s1.charAt(i),
                s1Map.getOrDefault(s1.charAt(i),0)+1
            );
            
            s2Map.put(s2.charAt(i),
            s2Map.getOrDefault(s2.charAt(i),0)+1
            );
        }

        if(s1Map.equals(s2Map)){
            return true;
        }

        int l = 0; 

        for (int r = s1.length(); r < s2.length(); r++) {
            s2Map.put(
                s2.charAt(r),
                s2Map.getOrDefault(s2.charAt(r), 0) + 1
            );

            s2Map.put(
                s2.charAt(l),
                s2Map.get(s2.charAt(l)) - 1
            );

            if (s2Map.get(s2.charAt(l)) == 0) {
                s2Map.remove(s2.charAt(l));
            }

            l++;

            if (s1Map.equals(s2Map)) {
                return true;
            }
        }

        return false;
    }
}
