class Solution{
    public int maxArea(int[] height){
        int heightLenth = height.length;
        int max = -1;

        for(int i=0;i<heightLenth-1;i++){
            for(int j=i+1;j<heightLenth;j++){
                int tmpHeight = Math.min(height[i], height[j]);
                int tmpWidth = j-i;
                int liter = tmpHeight * tmpWidth;
                if(max < liter){
                    max = liter;
                }
            }
        }
        return max;
    }
}