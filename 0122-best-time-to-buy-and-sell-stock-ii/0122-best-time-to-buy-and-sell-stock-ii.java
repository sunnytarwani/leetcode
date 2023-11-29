class Solution {
    public int maxProfit(int[] prices) {
         int sum = 0;

        for(int i = 0 ; i< prices.length-1 ; i++){
            int ans = 0;
              if(prices[i+1] - prices[i] > ans){
                  ans = prices[i+1] - prices[i];
              }
            sum += ans;
        }

        return sum;
    }
}