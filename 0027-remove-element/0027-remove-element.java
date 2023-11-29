class Solution {
    public int removeElement(int[] nums, int val) {
        //int [] count = new int[nums.length];
        int i = 0;
        for(int x = 0 ; x < nums.length ; x++){
            if(nums[x] != val){
                nums[i] = nums[x];
                i++;
            }
        }

        return i;
    }
}