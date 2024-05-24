class Solution {

    int count = 0 ;
    public int totalNQueens(int n) {
        boolean [] col1 = new boolean[n];
        boolean [] nCol = new boolean[2*n-1];
        boolean [] rCol = new boolean[2*n-1];

        checkQueen(0 , n , col1 , nCol , rCol);
        return count;
    }

    public void checkQueen(int row , int n , boolean [] col1 , boolean [] nCol , boolean [] rCol){
        if(row == n){
            count++;
            return;
        }

        for(int col = 0 ; col < n ; col++){
            if(!col1[col] && !nCol[row+col] && !rCol[row-col+n-1]){
                col1[col] = true;
                nCol[row+col] = true;
                rCol[row-col+n-1] = true;

                checkQueen(row+1 , n , col1 , nCol , rCol);

                col1[col] = false;
                nCol[row+col] = false;
                rCol[row-col+n-1] = false;
            }
        }
    }
}