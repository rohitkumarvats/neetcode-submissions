class Solution {
    public int majorityElement(int[] nums) {
        // Solution 1
        // int count=0;
        // int candidate=0;

        // for(int num:nums){
        //     if(count==0){
        //         candidate=num;
        //     }

        //     if(num==candidate){
        //         count++;
        //     } else {
        //         count--;
        //     }
        // }

        // return candidate;

        // Soultion 2
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}