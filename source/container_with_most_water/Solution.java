class Solution{
    public int maxArea(int[] height){
        int heightLength = height.length;
        int water = -1;

        int left = 0;
        int right = heightLength - 1;

        while(left < right){
            int w_width = right - left;
            int w_height = Math.min(height[left], height[right]);
            water = Math.max(water, width * height);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return water;
    }


    public int maxArea_timeout(int[] height){
        int heightLength = height.length;
        int max = -1;

        for(int i=0;i<heightLength-1;i++){
            for(int j=i+1;j<heightLength;j++){
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