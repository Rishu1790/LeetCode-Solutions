class Solution {
     public static void findCombination(int arr[],int target,int idx,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findCombination(arr, target-arr[idx], idx, ans, ds);
            ds.remove(ds.size()-1);
        }
        
        findCombination(arr, target, idx+1, ans, ds);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates, target, 0, ans, new ArrayList<>());
        return ans;
        
    }
}