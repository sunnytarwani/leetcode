class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int count = 0;
        int ans [] =new int [nums.length];
        for(int x = 0 ; x < nums.length ; x++){
            if(hm.containsKey(nums[x])){
                hm.put(nums[x] , hm.get(nums[x]) + 1);
            }
            else{
                hm.put(nums[x] , 1);
            }
            if(hm.get(nums[x]) <= 2){
                    nums[count] = nums[x];
                    count++;
                }
        }

        return count;
    }
}