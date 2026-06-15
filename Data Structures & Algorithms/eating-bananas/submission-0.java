class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        int k = r;

        while (l <= r){
            int midpoint = l+ ((r-l)/2);

            int totalTime = 0 ;

            for (int pile:piles){
                totalTime += Math.ceil((double) pile/midpoint);
            }
            if (totalTime <= h){
                k = midpoint;
                r = midpoint - 1;
            }else{
                l = midpoint + 1;
            }
        }
        return k;
    }   
}
