class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int r=0; r<n; r++){
            int start =0;
            int end = image[r].length-1;
            while(start<end){
                int temp=image[r][start];
                image[r][start]=image[r][end];
                image[r][end]=temp;
                start++;
                end--;
            }
            for(int i=0; i<n; i++){
                if(image[r][i]==0){
                    image[r][i]=1;
                }else{
                    image[r][i]=0;
                }
            }
        }
        return image;
    }
}