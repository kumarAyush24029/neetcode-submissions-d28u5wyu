class Solution {

    public static List<List<Integer>> result = new ArrayList<>();
    public static void find_num(int[] nums, int target,int index,List<Integer> sub_lst){
        // List<Integer> sub_lst = new ArrayList<>();
        if(target==0){
            result.add(new ArrayList<>(sub_lst));
            return;
        }
        else if(target<0) return;
        for(int i=index;i<nums.length;i++){
            sub_lst.add(nums[i]);
            // if(nums[i]==target){
            //     sub_lst.add(nums[i]);

            // }
            // else{
            //     find_num(nums,target-nums[i],i, sub_lst);
            // }
            find_num(nums,target-nums[i],i, sub_lst);
            sub_lst.remove(sub_lst.size()-1);

        }
        return;
            
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if(target==0) return new ArrayList<>();
        result.clear();
        find_num(nums, target,0,new ArrayList<Integer>());
        return result;

}
}