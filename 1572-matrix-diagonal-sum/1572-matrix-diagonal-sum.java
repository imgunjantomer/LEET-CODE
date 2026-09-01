class Solution {
    public int diagonalSum(int[][] mat) {
        int n= mat.length;
        int totalSum=0;
        int PD =0;
        for(int i=0; i<n; i++){
            int m=mat[0].length;
            for(int j=0; j<m; j++){
                if(i==j || i+j==n-1){
                    totalSum= totalSum + mat[i][j];
                }
            }
        }
        return totalSum;
    }
}