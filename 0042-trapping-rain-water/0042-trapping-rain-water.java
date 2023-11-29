class Solution {
    public int trap(int[] height) {

        int min [] = new int [height.length];
        int max [] = new int [height.length];


        min[0] = height[0];
        max[height.length-1] = height[height.length-1];

        for(int i = 1 ; i < height.length ; i++){
            min[i] = Math.max(min[i-1] , height[i]);
        }

        for(int i = height.length-2 ; i >=0 ; i--){
            max[i] = Math.max(max[i+1] , height[i]);
        }

        int sum = 0;
        for(int i = 0 ; i < height.length ; i++ ){
            int k = Math.min(min[i] , max[i]);
            sum +=  k-height[i];
        }

        return sum;
        
    }
}