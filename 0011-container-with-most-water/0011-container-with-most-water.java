class Solution {
    public int maxArea(int[] height) {
         int low=0;
        int high = height.length-1;
        int maxArea=Integer.MIN_VALUE;
        int currArea=0;

        while(low<high){
            int h=Math.min(height[low], height[high]);

            currArea= h*(high-low);

            maxArea=Math.max(currArea, maxArea);

            if(height[low]>height[high]){
                high--;
            }else{
                low++;
            }
        }
        return maxArea;

    }
}