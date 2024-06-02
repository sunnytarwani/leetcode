class Solution {
    public int minimumChairs(String s) {
        int count = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'E'){
                temp++;
            }
            else if(s.charAt(i) == 'L'){
                temp--;
            }

            count = Math.max(count , temp);
        }

        return count; 
    }
}