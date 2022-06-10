class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i < image.length;i++){
            int[] temp = new int[image[i].length];
            int k = 0;
            for(int j = image[i].length-1;j > -1;j--){
               temp[k++] = image[i][j]; 
            }
            for(int j = 0;j < image[i].length;j++){
                image[i][j] = temp[j];
            }
        }
        
        for(int i = 0;i < image.length;i++){
            for(int j = 0;j < image[i].length;j++){
               //System.out.println(image[i][j]);
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
