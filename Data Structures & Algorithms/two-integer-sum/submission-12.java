class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (numsMap.containsKey(diff)) {
                return new int[]{numsMap.get(diff), i};
            }
            numsMap.put(num, i);
        }
        return new int[]{};
    }
}
