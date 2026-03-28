class Solution {
 

public boolean searchMatrix(int[][] matrix, int target) {
  int Row=matrix.length-1;
  int col = 0;
  
  while(Row>=0&&col<matrix[0].length){
    if(target==matrix[Row][col]){
      return true;

    }
    if(target>matrix[Row][col]){
      col++;
    }
   else{
    Row--;
   }
  }

return false;
        
    }




  public static void main(String[] args) {
    int target =5;
    int matrix[][]={{1,4,7,11,15},
    {2,5,8,12,19},{3,6,9,16,22},
    {10,13,14,17,24},{18,21,23,26,30}
 };

    
  }
}
    
