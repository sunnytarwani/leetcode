class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCoin = 0;
        int tenCoin = 0;

        for(int x : bills){
            if(x == 5){
                fiveCoin++;
            }
            else if (x == 10){
                if(fiveCoin >= 1){
                    fiveCoin--;
                    tenCoin++;
                }
                else{
                    return false;
                }
            }
            else{
                if(fiveCoin >= 1 && tenCoin >=1){
                    fiveCoin--;
                    tenCoin--;
                }
                else if(fiveCoin >= 3){
                    fiveCoin = fiveCoin - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}