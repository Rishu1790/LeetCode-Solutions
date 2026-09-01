class Solution {

    public void solve(int[] candidates,int target,int i,List<List<Integer>> result,List<Integer> ds){


if(target==0){
            result.add(new ArrayList<>(ds));  
            return;   
        }

 if(i == candidates.length || target<0){
    return;
 }              


ds.add(candidates[i]);
solve(candidates,target-candidates[i],i,result,ds);
ds.remove(ds.size()-1);



solve(candidates,target,i+1,result,ds);





    } 

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(candidates,target,0,result,ds);

        return result ;

        
    }
}