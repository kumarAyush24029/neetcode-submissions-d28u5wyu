class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int total=0;
        while(left<right){
            boolean big = false;
            for(int j=left+1;j<right+1;j++){
                if(height[j]>=height[left]){
                    big=true;
                    break;

                }
            }
            if(height[left]>height[left+1] && big){
                


                
                total+=height[left]-height[left+1];
                height[left+1]=height[left];

            }
            left++;

           
        }
        left=0;
        right=height.length-1;
        while(right>left){
            boolean big = false;
            for(int j=right-1;j>-1;j--){
                if(height[j]>=height[right]){
                    big=true;
                    break;

                }
            }
            if(height[right]>height[right-1] && big){
                


                
                total+=height[right]-height[right-1];
                height[right-1]=height[right];

            }
            right--;
        }
           
           
        return total;
        
    }
}
