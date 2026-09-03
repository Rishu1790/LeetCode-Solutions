class Solution {
    
    static void solve(int k,int n,List<List<Integer>> ans,List<Integer> ds,int arr[],int i,int c){
        
        if(c == k && n==0){
            ans.add(new ArrayList(ds));
            return ;
        }
        if(n==0){
           
            return;
        }
        if(i>=arr.length){
            return;
        } 

        ds.add(arr[i]);
        solve(k,n-arr[i],ans,ds,arr,i+1,c+1);
        ds.remove(ds.size()-1);

        solve(k,n,ans,ds,arr,i+1,c);

        }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(k,n,ans,ds,arr,0,0);
        return ans;

        
    }
}