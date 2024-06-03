class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }


        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int k = (numRows-1) * 2;

        for(int i = 0 ; i < numRows ; i++){
            int index = i;
            while(index < n){
                sb.append(s.charAt(index));
                if(i!= 0 && i!= numRows-1){
                    int check = index + (k - (2*i));
                    if(check < n){
                         sb.append(s.charAt(check));
                    }
                }
                index = index + k;
            }
        }

        return sb.toString();
    }
}