class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length;i++){
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > temperatures[stack.peek()] ) {
                int dayIndex = stack.pop();
                ans[dayIndex] = i - dayIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
