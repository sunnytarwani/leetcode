class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gSize = 0;
        int sSize = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(sSize < s.length){
            if(gSize >= g.length){
                    break;
            }
            if(g[gSize] <= s[sSize]){
                gSize++;
            }

            sSize++;
        }
        return gSize;
    }
}