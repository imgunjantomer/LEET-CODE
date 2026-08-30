class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int max=0;
        int SP=0;
        int[] trace=new int[n];
        for(int i=0; i<n; i++){
            SP=SP+gain[i];
            trace[i]=SP;
        }
        for(int i=0; i<n; i++){
            if(trace[i]>max){
                max=trace[i];
            }
        }
        return max;
    }
}