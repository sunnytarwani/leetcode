class Solution {
    public boolean canJump(int[] nums) {
       int finalStage = nums.length-1;
        for(int i = nums.length-2 ; i>=0 ; i--){
            if(i + nums[i] >= finalStage){
                finalStage = i;
            }   
        }   
        return finalStage == 0;
    }
}