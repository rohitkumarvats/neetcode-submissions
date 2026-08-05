class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxWater=0;

        while(left<right){
            int widht=right-left;
            int currentHeight=Math.min(heights[left], heights[right]);
            int currentArea=widht*currentHeight;
            maxWater=Math.max(maxWater, currentArea);

            if(heights[left]<heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
