class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arrayCheck= new ArrayList<>();
        boolean [] freq = new boolean[nums.length];

        checkPerm(nums , ans , arrayCheck , freq);

        return ans;
    }

    public static void  checkPerm(int[] nums , List<List<Integer>> ans , List<Integer> arrayCheck , boolean [] freq){

        if(arrayCheck.size() == nums.length){
            ans.add(new ArrayList<>(arrayCheck));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                arrayCheck.add(nums[i]);
                checkPerm(nums , ans , arrayCheck , freq);
                arrayCheck.remove(arrayCheck.size()-1);
                freq[i] = false;
            }
        }
    }
}