class Solution {
    public int maxProfit(int[] prices) {
        int m = Integer.MAX_VALUE;
       int ans = 0;

        for(int i : prices){
            m = Math.min(m , i);
            ans = Math.max(ans , i-m);
        }

        return ans;
    }
}