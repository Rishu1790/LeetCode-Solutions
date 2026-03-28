class Solution {
    public int[] searchRange(int[] nums, int target) {
        
 int low =0;
        int high = nums.length-1;
        int newNums[]={-1,-1};
        while(low<=high){
           int mid = low + (high - low) / 2;
            if(nums[mid] >= target){
                if(target==nums[mid]){
                    newNums[0]=mid; 
                }
                
                high = mid-1;

            }else{
                low=mid+1;
            }
            
        }
        low=0;
        high=nums.length-1;

          while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]<=target){
               if(target==nums[mid]){
                 newNums[1]=mid; 
               }
                
                low = mid+1;

            }else{
                high=mid-1;
            }
         
        }






        return newNums;






    }
}