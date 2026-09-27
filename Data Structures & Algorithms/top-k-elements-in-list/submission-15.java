class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0; i--) {
            for (int j : freq[i]) {
                res[index++] = j;
                if (index == k) {
                    return res;
                }
            }    
        }
        return new int[0];
    }
}
