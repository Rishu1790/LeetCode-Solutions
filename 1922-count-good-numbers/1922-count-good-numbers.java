class Solution {
    static long MOD = 1_000_000_007;
   /// Calculate Good no. 
    public int countGoodNumbers(long n) {

        long even = (n+1)/2;
        long odd = n/2;

        long firstPass=myPower(5,even);
        long secondPass=myPower(4,odd);

       return (int)((firstPass*secondPass)%MOD);
    }
     /// Power Function 

     public static long myPower(long x,long y){
        if(y==0) return 1;

        long half = myPower(x,y/2);
        long res = (half*half)%MOD;

        if((y%2)!=0){
            res = (x*res)%MOD;

        }
        return res;

       }
}