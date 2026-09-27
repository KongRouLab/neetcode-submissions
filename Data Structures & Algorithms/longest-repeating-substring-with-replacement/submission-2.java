class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0, freq = 0, res = 0;

        for (int r = 0; r < s.length(); r ++) {
            count[s.charAt(r) - 'A']++;
            freq = Math.max(freq, count[s.charAt(r) - 'A']);
            if ((r - l + 1) - freq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
