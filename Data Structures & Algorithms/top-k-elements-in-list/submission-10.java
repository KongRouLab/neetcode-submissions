class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List [nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            bucket[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length-1; i >=0 && result.size() < k; i--) {
            for (int num : bucket[i]) {
                result.add(num);
                if (result.size() == k) {
                    break;
                }
            }
            
        }
        
        int[] res = new int[k];
        int j = 0;
        for (int n : result) {
            res[j++] = n;
        }
        return res;
    }
}
