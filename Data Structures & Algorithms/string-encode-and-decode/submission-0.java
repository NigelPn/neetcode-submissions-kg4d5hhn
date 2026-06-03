class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        StringBuilder encodeStr = new StringBuilder();
        for(String str:strs){
            encodeStr.append(str.length()).append('*').append(str);      
        }

        return encodeStr.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();

        List<String> decodeArr = new ArrayList<>();
        int x = 0;

        while (x < str.length()){
            int y = x;
            while (str.charAt(y) != '*'){
                y++;
            }
            int strLen = Integer.parseInt(str.substring(x,y));
            x = y + 1 ;
            y = x + strLen;
            decodeArr.add(str.substring(x,y));
            x = y;
        }
        return decodeArr;
    }
}
