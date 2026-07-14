class Solution {
    public int removeElement(int[] nums, int val) {
        int officer=0;
        int checker=0;
        int uniqueCount=0;

        while(checker<nums.length){
            if(nums[checker]==val){
                checker++;
            } else {
                uniqueCount++;
                nums[officer]=nums[checker];
                officer++;
                checker++;
            }
        }
        return uniqueCount;
    }
}