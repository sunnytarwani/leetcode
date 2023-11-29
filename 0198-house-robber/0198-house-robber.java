class Solution {
    public int rob(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        // if(nums.length == 2){
        //     return Math.max(nums[0] , nums[1]);
        // }

        int dp[] = new int [nums.length];
        Arrays.fill(dp , -1);

        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0] , nums[1]);
        // for(int i = 2 ; i < nums.length ; i++){
        //     dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
        //     //dp[i] = Math.max(s , (dp[i-1] - nums[i-1]) + nums[i]);
        // }
        // return dp[nums.length-1];
        return robber(dp , nums , nums.length -1  );
    }

    public static int robber( int [] dp , int [] nums , int i ){
        if(i < 0){
            return 0;
        }

        if(dp[i] == -1){
            dp[i] = Math.max(nums[i] + robber(dp , nums , i-2) , robber(dp , nums , i-1) );
        }

        return dp[i];
    }
}