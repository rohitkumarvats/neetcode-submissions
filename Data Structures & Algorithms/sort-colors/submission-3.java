class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;

        while(mid<=right){
            if(nums[mid]==0){
                swapArray(nums, left, mid);
                left++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else if(nums[mid]==2){
                swapArray(nums, mid, right);
                right--;
            }
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}