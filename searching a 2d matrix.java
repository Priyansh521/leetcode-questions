class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Finding the row where the target might be present
        int rowToSearch = 0;
        while (rowToSearch < rows && matrix[rowToSearch][0] <= target) {
            if (matrix[rowToSearch][0] == target) {
                return true;
            }
            rowToSearch++;
        }

        // If the target is not in any row then return false
        if (rowToSearch == 0) {
            return false;
        }

        // Search within the identified row
        for (int col = 0; col < cols; col++) {
            if (matrix[rowToSearch - 1][col] == target) {
                return true;
            }
        }

        return false;
    }
}
