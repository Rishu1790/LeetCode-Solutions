class Solution {
     public static int days(int cap,int weights[]) {
        int days =1;
        int load =0;
        for (int i = 0; i < weights.length; i++) {
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }else{
                load +=weights[i];
            }
            
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
         int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low<=high){
            int mid = (low+high)/2;
            int minDays = days(mid, weights);
            if(minDays<=days){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;

        
    }
}