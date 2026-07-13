class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Solution 1
        // int[] result=new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             result[0]=i;
        //             result[1]=j;
        //         }
        //     }
        // }
        // return result;

        // Solution 2
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];

        // Solution 3
        // int left=0;
        // int right=nums.length-1;
        // boolean isDescending=nums[0]>nums[nums.length-1];
        // while(left<right){
        //     int sum=nums[left]+nums[right];

        //     if(sum==target){
        //         return new int[] {left, right};
        //     } else if(sum<target){
        //         if(!isDescending){
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     } else {
        //         if(!isDescending){
        //             right--;
        //         } else {
        //             left++;
        //         }
        //     }
        // }
        // return new int[0];
    }
}
