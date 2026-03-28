class Solution {
   public static void setZeroes(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean[] row = new boolean[rows];
    boolean[] col= new boolean[cols];

    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        if(matrix[i][j]==0){
          row[i] = true;
          col[j] = true;
        }
      }
    }


    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        if(row[i]||col[j] ){
          matrix[i][j]=0;
        }
      }
    }

    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
      int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
      setZeroes(matrix);

      
    }
}