class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
     
         int MS=Integer.MIN_VALUE;
        int CS=0;
        double Average=0.00;
        for(int i=0;i<nums.length;i++){
          CS +=nums[i];

          if(i>=k-1){
            MS = Math.max(CS, MS);

            CS = CS-nums[i-(k-1)];
          }

          
        }
        
      Average = ((double)MS)/k;
      return Average;

        
    
    }
}