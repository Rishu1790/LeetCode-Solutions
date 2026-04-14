class Solution {
    public static double possible(int[] dist, double speed){
        double totalTime = 0.0;
        for(int i=0;i<dist.length;i++){
            double t = (double)dist[i]/speed;
            if(i<dist.length-1){
                totalTime=totalTime+Math.ceil(t);
            }else{
                totalTime = totalTime+t;

            }
        }
        
        return totalTime;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour<= dist.length-1) return -1;
        int low=1;
        int high = 10000000;
        int result =-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            double total = possible(dist,mid);

            if(total<=hour){
                result =mid;



                high=mid-1;

            }else{
                low=mid+1;
            }
      
        }

return result;

    }
}