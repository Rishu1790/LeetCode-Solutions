class Solution {

  public static boolean check(int nums[]) {

    int count = 0;
    Boolean isSorted = true;
    for(int i=0;i<nums.length;i++){
      if(nums[i]>nums[(i+1)%nums.length]){
        count++;
      
      }
    }
    if(count>1){
      isSorted = false;
    }

    return isSorted;
  }

  public static void main(String[] args) {
      int nums[]={6,10,6};
     System.out.println(check(nums));
   }
}
