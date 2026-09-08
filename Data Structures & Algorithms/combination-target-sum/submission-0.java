class Solution {

    public List<List<Integer>> result = new ArrayList<>();

    public void find_nums(
        int[] nums,
        int target,
        int index,
        List<Integer> sub_lst
    ) {

        if (target == 0) {
            result.add(new ArrayList<>(sub_lst));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < nums.length; i++) {

            sub_lst.add(nums[i]);

            find_nums(
                nums,
                target - nums[i],
                i,
                sub_lst
            );

            sub_lst.remove(sub_lst.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        result.clear();

        find_nums(nums, target, 0, new ArrayList<>());

        return result;
    }
}