class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        //first string is compared with second.
        String first = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            String second = strs[i];
            int j = 0;
            while(j < first.length() && j < second.length() && first.charAt(j) == second.charAt(j)){
                j++;

            }

            first = first.substring(0 , j);
        }

        return first;
    }
}