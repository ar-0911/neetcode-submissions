class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), 0, target, 0, nums);
        return ans;
    }

    private void helper(List<List<Integer>> ans,
                        List<Integer> temp,
                        int sum,
                        int target,
                        int index,
                        int[] nums) {

        if (sum == target) {
            ans.add(new ArrayList<>(temp)); // COPY
            return;
        }

        if (sum > target || index == nums.length) {
            return;
        }

        // Pick current element
        temp.add(nums[index]);
        helper(ans, temp, sum + nums[index], target, index, nums);
        temp.remove(temp.size() - 1); // backtrack

        // Skip current element
        helper(ans, temp, sum, target, index + 1, nums);
    }
}
