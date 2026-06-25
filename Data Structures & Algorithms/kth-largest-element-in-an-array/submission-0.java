class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> easeOfMind = new ArrayList<>();

        for(int num :nums){
            easeOfMind.add(num);
        }
        
        return recusiveFind(easeOfMind,k);
    }

    public int recusiveFind(ArrayList<Integer> nums , int k){
        ArrayList<Integer> lessThanArr = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> moreThanArr = new ArrayList<>();
        
        int pivot = nums.get((int)(Math.random() * nums.size()));
  
        for (int num : nums) {
            if (num < pivot) {
                lessThanArr.add(num);
            } else if (num > pivot) {
                moreThanArr.add(num);
            } else {
                equal.add(num);
            }
        }

        if (k <= moreThanArr.size()) {
            return recusiveFind(moreThanArr, k);
        }

        if (k > moreThanArr.size() + equal.size()) {
            return recusiveFind(lessThanArr,k - moreThanArr.size() - equal.size());
        }
        return pivot;
    }
}
