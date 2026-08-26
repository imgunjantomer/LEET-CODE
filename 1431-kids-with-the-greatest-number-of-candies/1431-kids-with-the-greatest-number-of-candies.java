class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        Boolean[] result=new Boolean[n];
        int temp = candies[0];
        for(int i=0; i<n; i++){
            if(temp<candies[i]){
                temp=candies[i];
            }
        }
        for(int i=0; i<n; i++){
            if(candies[i]+extraCandies>=temp){
                result[i]=true;
            }else{
                result[i]=false;
            }
        }
        return Arrays.asList(result);
    }
}