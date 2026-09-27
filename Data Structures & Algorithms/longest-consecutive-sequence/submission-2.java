class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            numSet.add(n);
        }

        int longest = 0;

        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int len = 1;
                while (numSet.contains(n + len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
