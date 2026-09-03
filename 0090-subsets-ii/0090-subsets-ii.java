class Solution {

static List<List<Integer>> solve(int[] nums,List<List<Integer>> result, List<Integer> ds,int i){
    if(i >= nums.length ){
        result.add(new ArrayList<>(ds));
        return result;
    }

  

    ds.add(nums[i]);
    solve(nums,result,ds,i+1);
    ds.remove(ds.size()-1);
      while(i+1< nums.length && nums[i]==nums[i+1]){
     i++;
    }

solve(nums,result,ds,i+1);
    return result;
}


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
           List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(nums,result,ds,0);

        return result;
    }
}