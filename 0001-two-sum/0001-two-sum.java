class Solution {

    public int[] twoSum(int[] Arr, int Target) {

        int I1 = 0;
        int I2 = 0;

        for(int i = 0; i < Arr.length; i++){

            for(int j = i + 1; j < Arr.length; j++){

                if((Arr[i] + Arr[j]) == Target){

                    I1 = i;
                    I2 = j;

                    return new int[]{I1, I2};
                }
            }
        }

        return new int[]{-1, -1};
    }
}