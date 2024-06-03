class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int ans = -1;
        for(int i = 0 ; i < haystack.length() ; i++ ){
            if(haystack.charAt(i) == needle.charAt(count)){
                count++;
            }
            else if (haystack.charAt(i) != needle.charAt(count)){
                i -= count;
                count = 0;
            }

            if (count == needle.length()){
                return (i-=count-1);
            }

        }
        return (-1);
    }
}