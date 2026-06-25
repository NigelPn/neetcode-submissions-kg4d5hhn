class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         

        for(int stone : stones) maxHeap.offer(stone);

        while(maxHeap.size() > 1 ){
            int larg1 = maxHeap.poll();
            int larg2 = maxHeap.poll();

            if(larg1 != larg2 ){
                maxHeap.offer(larg1-larg2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
