class Solution {
    public boolean isAnagram(String s, String t) {
      int lenS=s.length();
        int lenT=t.length();
       
       
        if(lenS!=lenT){
            return false;
        }

        int Arr[]=new int[26];

        for (int i = 0; i < s.length(); i++) {

            Arr[s.charAt(i)-'a']++;
            
        
          Arr[t.charAt(i)-'a']--;
        }
        
        for(int c: Arr){
            if(c!=0)
                return false;
        }


       return true;


        
    }
    }
