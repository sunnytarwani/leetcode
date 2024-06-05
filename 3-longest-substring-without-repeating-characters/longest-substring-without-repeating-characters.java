class Solution {
    public int lengthOfLongestSubstring(String s) {
          Queue<Character> queue = new LinkedList<>();

        int i = 0;
        int j = 0;
        int maxSize = 0;

        while(j < s.length()){
            if(!queue.contains(s.charAt(j))){
                queue.add(s.charAt(j));
                maxSize =Math.max(maxSize , queue.size());
                j++;
            }
            else{
                while(queue.contains(s.charAt(j))){
                    queue.remove(s.charAt(i));
                    i++;
                }
            }
        }

        return (maxSize);
    }
}