class Solution {
    public int[] productExceptSelf(int[] nums) {
        
   int n = nums.length;
        int[] arr = new int[n];

        int Prefix[] = new int[n];
        Prefix[0]=1;
        
        for(int i=1;i<n;i++){
            
        Prefix[i]= Prefix[i-1]*nums[i-1];
        }
        int Suffix[] = new int[n];
        Suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            Suffix[i]=Suffix[i+1]*nums[i+1];
        }
        
        for(int i=0;i<n;i++){
            arr[i]=Prefix[i]*Suffix[i];
        }
  
        return arr;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        
    }
}