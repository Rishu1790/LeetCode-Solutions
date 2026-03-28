class Solution {
    public int lengthOfLongestSubstring(String s) {
         int r=0;
        int l=0;
        int maxlen =0;
        int len = 0;
        int Arr[] =new int[256];
        java.util.Arrays.fill(Arr, -1);
        while(r<s.length()){
            
           l= Math.max(l, Arr[s.charAt(r)]+1);
            len = r-l+1;
            maxlen = Math.max(maxlen, len);
            Arr[s.charAt(r)]=r;
            r++;
            
        }
return maxlen;
        
    }
}