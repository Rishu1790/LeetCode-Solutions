class Solution {
    private static void findSubset(int arr[],int idx,List<List<Integer>> ans,List<Integer> ds){
        if(idx == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        findSubset(arr,idx+1,ans,ds);
        ds.remove(ds.size()-1);
        

        findSubset(arr,idx+1,ans,ds);




    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        findSubset(nums,0,ans,new ArrayList<>());
        
        return ans;
    }
}