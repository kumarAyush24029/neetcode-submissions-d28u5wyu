class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] stored = new int[nums.length];
        Arrays.fill(stored,1);

        int maxl =1;
        for(int i=0;i<stored.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && stored[j]>=stored[i]){
                    stored[i] = stored[j]+1;
                    maxl = Math.max(maxl,stored[i]);
                }
            }
        }
        // System.out.println(stored);
        // for(int intem:stored) System.out.println(intem);
        return maxl;
        



        
    }
}
