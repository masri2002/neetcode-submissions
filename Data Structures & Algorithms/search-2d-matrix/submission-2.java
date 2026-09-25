class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lA = 0, rA = matrix.length - 1;

        while (lA <= rA) {
            int midA = lA + (rA - lA) / 2;

            int lI = 0, rI = matrix[midA].length - 1;

            while (lI <= rI) {
                int midI = lI + (rI - lI) / 2;

                if (matrix[midA][midI] == target) {
                    return true;
                } else if (matrix[midA][midI] < target) {
                    lI = midI + 1;
                } else {
                    rI = midI - 1;
                }
            }

            if (target < matrix[midA][0]) {
                rA = midA - 1;
            } else {
                lA = midA + 1;
            }
        }

        return false;
    }
}