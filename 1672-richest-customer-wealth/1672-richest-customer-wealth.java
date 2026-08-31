class Solution {
    public int maximumWealth(int[][] accounts) {
        int n= accounts.length;
        int[] rich=new int[n];
        for(int i=0; i<n; i++){
            int sum=0;
            int m= accounts[i].length;
            for(int j=0; j<m; j++){
                sum=sum + accounts[i][j];
            }
            rich[i]=sum;
        }
        int max=0;
        for(int k=0; k<n; k++){
            if(rich[k]>max){
                max=rich[k];
            }
        }
        return max;
    }
}