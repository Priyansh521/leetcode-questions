class Solution {
    public boolean isSafe(char[][] board,int row,int col, int number){
        for(int i = 0; i<board.length; i++){
             //for checking the row
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
        }
        for(int j = 0; j<board.length; j++){   
            // for checking the col
            if(board[row][j]==(char)(number + '0')){
                return false;
            }
        }
        // for checking the grid
        int sr = 3*(row/3);     // methof to calculate the row in 3*3 row
        int sc = 3*(col/3);     // method to calculate the col in the 3*3 grid
        //to iterate through row of the grid
        for(int i = sr; i<sr+3; i++){
        //to iterate through the dol of the grid
            for(int j = sc; j<sc+3; j++){
                //checking if the number we're entering id available in the grid or not'
                if(board[i][j] == (char)(number +'0')){
                    return false;
                }
            }
        }
       
        return true;
    }
    public boolean helper(char[][] board,int row,int col){
        //base condition if row gets equal to the length then it will return true
        if(row == board.length){
            return true;
        }
        int ncol = 0;
        int nrow = 0;
        //below condition will help us iterate through different columns in the same row
        if(col == board.length -1){
            nrow = row +1 ;
            ncol = 0 ;
        }
        //below condition will help us iterate through different rows after the last col
        else{
            nrow = row;
            ncol = col+1;
        }
        //below condition check if the box has a number or empty if number gofor another box
        if(board[row][col] != '.'){
            /*we're using recursion here calling helper again to check if it has
            filled every box in the sudoku
            */
            if(helper(board, nrow, ncol)){
                return true;
            }
        }
         //filling the box with the element
         else{
            for(int i = 1; i<=9; i++){
                //calling isSafe to check if it is dafe to put that number in that place
                if(isSafe(board, row, col  , i)){
                      board[row][col] = (char)(i + '0');
                       //recursion for the new row and new col
                       if(helper(board, nrow, ncol)){
                           return true;
                        }
                        /*backtracking if the solution was not right by replacing the filled
                        number with '.' to show it's null'
                        */
                         else{ board[row][col] = '.' ; 
                         }
                } 
            }
         }
            return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
