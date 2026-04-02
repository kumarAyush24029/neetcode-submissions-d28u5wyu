class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int k=numbers.length;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                }
                else if(numbers[i]+numbers[j]>target){
                    k=j+1;
                    break;
                }
               
            }
        }
        return result;
        
    }
}
