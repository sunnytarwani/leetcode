class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> checkAL = new ArrayList<>();
        checkSum(0 , candidates , target , checkAL , ans);

        return ans;
    }

    public static void checkSum(int i ,int[] a , int target , ArrayList<Integer> checkAL ,List<List<Integer>>  ans){


        if(i==a.length){
            if(target == 0){
                ans.add(new ArrayList(checkAL));
            }

            return;
        }

        if(target >= a[i]){
            checkAL.add(a[i]);
            checkSum(i , a , target - a[i] , checkAL , ans );
            checkAL.remove(checkAL.size()-1);
        }

        checkSum(i+1 , a , target , checkAL , ans );
    }
}