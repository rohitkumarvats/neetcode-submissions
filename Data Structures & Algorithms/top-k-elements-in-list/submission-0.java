class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] arr=new List[nums.length+1];
        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(arr[frequency]==null){
                arr[frequency]=new ArrayList<>();
            }
            arr[frequency].add(key);
        }

        int[] result=new int[k];
        int index=0;

        for(int i=arr.length-1; i>=0 && index<k; i--){
            if(arr[i]!=null){
                for(int num:arr[i]){
                    result[index++]=num;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
