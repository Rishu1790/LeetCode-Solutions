class Solution {
    public int minSubArrayLen(int target, int[] nums) {int low =0;
 
  int minWindow = Integer.MAX_VALUE;
  int sum =0;

for(int high=0;high<nums.length;high++){
    sum = sum+nums[high];
    while(sum>=target){
         int currWin = high-low+1;
        minWindow = Math.min(currWin,minWindow);
        sum = sum -nums[low];
        low++;
    }
}
 if (minWindow == Integer.MAX_VALUE) {
    return 0;
} else {
    return minWindow;
}
    }
}