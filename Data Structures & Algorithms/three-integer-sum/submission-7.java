class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    List<Integer> triplet =
                        Arrays.asList(nums[i], nums[left], nums[right]);

                    // HashSet prevents duplicates
                    if (seen.add(triplet)) {
                        result.add(triplet);
                    }

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
