class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 ;
        int j = 0;

        int checkSum = 0;
        int maxLength = Integer.MAX_VALUE;

        while(j < nums.length ){
            checkSum += nums[j];
            j++;

            while(checkSum>=target){
                int size = j - i;
                maxLength = Math.min(maxLength , size);

                checkSum -= nums[i];
                i++;
            }
        }
        if(maxLength == Integer.MAX_VALUE ){
            return 0;
        }
        return maxLength;
    }
}