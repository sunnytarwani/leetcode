class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;

        int area;
        int maxSize = 0;

        while(i < j){
            area = Math.min(height[i] , height[j]) * (j -i);
            maxSize = Math.max(maxSize , area);

            if(height[i] > height[j]){
                j--;
            }
            else {
                i++;
            }
        }

        return maxSize;
    }
}