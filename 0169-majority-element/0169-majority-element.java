class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer , Integer> hm = new HashMap<>();
        // int max1 = 0;
        // int ans = 0;

        // for(int x : nums){
        //     if(hm.containsKey(x)){
        //         hm.put(x , hm.get(x) + 1);

        //     }
        //     else{
        //         hm.put(x , 1);
        //     }
        //     if(hm.get(x) > max1){
        //         max1 = hm.get(x);
        //         ans = x;
        //     }
        // }

        // return ans;

         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)>(nums.length/2)){
                return i;
            }
        }
        return 0;
    }
}