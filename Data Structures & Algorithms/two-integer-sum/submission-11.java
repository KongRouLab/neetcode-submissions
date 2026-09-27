class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> preMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (preMap.containsKey(diff)) {
                return new int[]{preMap.get(diff), i};
            }
            preMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
