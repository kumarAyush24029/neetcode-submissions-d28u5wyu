class Solution {
    public int maxProduct(int[] nums) {
        int leftp =1;
        int rightp =1;
        int maxp = nums[0];
        int n = nums.length;

        for(int i=0;i<n;i++){
            leftp = leftp==0? 1:leftp;
            rightp = rightp==0? 1:rightp;

            leftp *= nums[i];
            rightp *= nums[n-i-1];

            maxp = Math.max(Math.max(leftp,rightp),maxp);

        }
        return maxp;

        
        
    }
}
