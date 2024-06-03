class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int [] check = new int [n+1];

        for(int i : citations  ){
            if(i > n){
                check[n]+=1;
            }
            else{
                check[i] += 1;
            }
        }

        int ans = 0;
        for(int i = n ; i >= 0 ;i--){
            ans += check[i];
            if(ans >= i){
                return i;
            }
        }

        return 0;

    }
}