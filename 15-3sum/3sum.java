class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> arrayLists = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-2 ; i++){
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int checkSum = nums[i] + nums[j] + nums[k];
                if(checkSum > 0){
                    k--;
                }
                else if(checkSum < 0){
                    j++;
                }
                else{
                    arrayLists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                      while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                }
            }
        }
         return arrayLists;

    }
}