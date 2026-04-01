class Solution {
    public int lengthOfLastWord(String s) {
         int count =0;
         int i =s.length()-1;
        //for(int i = s.length()-1;i>=0;i--)
        while(i>=0)
        {
            if(s.charAt(i)!=' '){
                count++;
                i--;
            }
             
            else if(count==0){
                i--;
            }
            else{
                return count;
            }
          
            
            
        }
        return count;
    }
}