class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int[m][n];

        for(int []a :dp){
            Arrays.fill(a , -1);
        }

        return (uniquePathObstacle(dp , obstacleGrid , m-1 , n-1));
    }

    public static int uniquePathObstacle(int[][] dp, int[][] a, int i, int j) {
        if(i == 0 && j==0 && a[i][j] == 0 ){
            return 1;
        }
        if(i < 0 || j<0 || a[i][j] == 1 ){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = uniquePathObstacle(dp , a , i , j-1);
        int left = uniquePathObstacle(dp , a , i-1 , j);

        return dp[i][j] = up+left;
    }
}