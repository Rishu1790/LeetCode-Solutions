class Solution {
    static void solve(String digits, String[] mapping,int index,List<String> ans,StringBuilder str){
        if(index>=digits.length()){
            ans.add(str.toString());
            return;
        }

        int value = digits.charAt(index)-'0';
        String mappedKey = mapping[value];


        for(int i=0;i<mappedKey.length();i++){
            str.append(mappedKey.charAt(i));
            solve(digits,mapping,index+1,ans,str);
            str.deleteCharAt(str.length()-1);


        }
        

    }
   
    public List<String> letterCombinations(String digits) {
        String[] mapping ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder str = new StringBuilder();
        int index =0;
        List<String> ans = new ArrayList<>();
        solve(digits,mapping,index,ans,str);
        return ans;
    }
}