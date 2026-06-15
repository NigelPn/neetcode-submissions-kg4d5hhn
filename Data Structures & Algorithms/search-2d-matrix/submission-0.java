class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int chosenRow = 0;
        int top = 0  ;
        int bttm = rows-1;

        while(top <= bttm){
            chosenRow = top + ((bttm-top)/2);
            if (target > matrix[chosenRow][cols-1]){
                top = chosenRow + 1;
            }else if (target < matrix[chosenRow][0]){
                bttm = chosenRow - 1;
            }else{
                break;
            }
        }

        if (!(top <= bttm)) {
                return false;
        }

        int l = 0;
        int r = cols - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[chosenRow][m]) {
                l = m + 1;
            } else if (target < matrix[chosenRow][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;

    }
}
