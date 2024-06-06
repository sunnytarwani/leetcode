class Solution {
    public String minWindow(String s, String t) {
         if(s.length() < t.length()){
            System.out.println("");
        }
        int [] freq = new int [128];
        for(int i = 0 ; i < t.length() ; i++){
            freq[t.charAt(i)]++;
        }

        int i = 0;
        int j = 0;
        int maxLength = Integer.MAX_VALUE;
        int minStart = 0;
        int count = t.length();


        while(j < s.length()){
            char startLetter = s.charAt(j);
            if(freq[startLetter] > 0){
                count--;
            }
            freq[startLetter]--;
            j++;

            while(count == 0){
                if(maxLength > j - i){
                    maxLength = j-i;
                    minStart = i;
                }

                char removeLetter = s.charAt(i);
                freq[removeLetter]++;
                if(freq[removeLetter] > 0){
                    count++;
                }
                i++;
            }
        }

        if(maxLength == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(minStart , minStart+maxLength);
    }
}