class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int len=0;
        HashSet<Integer> hs =  new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])) hs.add(nums[i]);

        }
        for(int j =0;j<nums.length;j++){
            if(!hs.contains(nums[j]-1)){
                int current = nums[j];
                int count=1;
                while(hs.contains(current+1)){
                    count+=1;
                    current+=1;


                }
                len=Math.max(len,count);

            }
        }
        return len;
    }
}
