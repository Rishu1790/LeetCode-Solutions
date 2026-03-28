class Solution {
    public int maxSubArray(int[] nums) {
          int CS = 0;
        int MS = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            CS = CS + nums[i];

            if (CS > MS) {
                MS = CS;
            }

            if (CS < 0) {
                CS = 0;
            }
        }

        return MS;
        
    }
}