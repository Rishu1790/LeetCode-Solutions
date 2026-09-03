class Solution {
    static void solve( int[] candidates , int target ,List<List<Integer>> ans,List<Integer> ds,int i){
    if(target==0){
     ans.add(new ArrayList<>(ds) );
     return;
    
    }
    if(i>=candidates.length){

      return;
    }
    if(target<0){
        return;
    }
    ds.add(candidates[i]);
    solve(candidates,target-candidates[i],ans,ds,i+1);
    ds.remove(ds.size()-1);

    while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
        i++;
    }

    solve(candidates,target,ans,ds,i+1);

    return;




}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        int i =0;
        solve(candidates,target,ans,ds,i);
        return ans;

        
    }
}