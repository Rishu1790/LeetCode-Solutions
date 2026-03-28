import java.util.*;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int ER = matrix.length-1;
        int EC = matrix[0].length-1;
        int SR=0;
        int SC=0;

        while(SR<=ER && SC<=EC){

            for(int j=SC;j<=EC;j++){
                ans.add(matrix[SR][j]);
            }
            SR++;

            for(int i=SR;i<=ER;i++){
                ans.add(matrix[i][EC]);
            }
            EC--;

            if(SR<=ER){
                for(int j=EC;j>=SC;j--){
                    ans.add(matrix[ER][j]);
                }
                ER--;
            }

            if(SC<=EC){
                for(int i=ER;i>=SR;i--){
                    ans.add(matrix[i][SC]);
                }
                SC++;
            }
        }

        return ans;
    }
}