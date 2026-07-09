class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i-1] == nums[i]){
        //         return true;
        //     }
        // }
        // return false;

        Set<Integer> set= new HashSet<>();

        for(int n:nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}