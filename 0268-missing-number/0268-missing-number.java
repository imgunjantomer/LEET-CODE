class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int actualSum;
        actualSum= n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int missing=actualSum-sum;
        return missing;
    }
}