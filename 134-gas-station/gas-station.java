class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int position = 0;
        int sum = 0;
        int total = 0;


        for(int i = 0 ; i < gas.length ; i++){
            sum += gas[i] - cost[i];

            if(sum < 0){
                total += sum;
                sum = 0;
                position = i + 1;
            }
        }

        total  += sum ;
        if(total >=0){
            return position;
        }

        return -1;
    }
}