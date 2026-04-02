class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;

        for(int i=0;i<nums.length;i++){
            prod*=nums[i];

        }
        int[] output = new int[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                int newp=1;
                for(int k =0;k<nums.length;k++){
                    if(k==j) continue;
                    newp*=nums[k];
                }
            output[j]=newp;    

            }

            else{
                output[j]=prod/nums[j];

            }
            
        }
        return output;
        
    }
}
       
