class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        
            int comp = target-nums[i];
            if(mp.containsKey(comp)){
                result[1]=i;
                result[0]=mp.get(comp);
                System.out.println(result);
                return result;

            }
            mp.put(nums[i],i);

        }
     
        return result;
        
    }
}
