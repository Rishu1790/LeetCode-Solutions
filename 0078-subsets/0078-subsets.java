class Solution {


static List<List<Integer>> solve(int[] nums,List<List<Integer>> result, List<Integer> ds,int i){
    if(i >= nums.length ){
        result.add(new ArrayList<>(ds));
        return result;
    }

    ds.add(nums[i]);
    solve(nums,result,ds,i+1);
    ds.remove(ds.size()-1);
    solve(nums,result,ds,i+1);

    return result;
}

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(nums,result,ds,0);

        return result;

        
    }
}