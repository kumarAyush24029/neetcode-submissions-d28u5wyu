class Solution {
    public int maxArea(int[] height) {
        int volume =0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int min=0;
            if(height[left]<height[right]) min= left;
            else min = right;
            int newvol=Math.min(height[left],height[right])*(right-left);
            volume=Math.max(volume,newvol);
            if(min==left) left++;
            else right--;
        }
        
        return volume;
       
    }
}