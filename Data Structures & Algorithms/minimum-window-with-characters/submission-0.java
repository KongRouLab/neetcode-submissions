class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0;
        int required = countT.size();
        int formed = 0;

        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && window.get(c).intValue() == countT.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                char ch = s.charAt(l);

                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                window.put(ch, window.get(ch) - 1);
                if (countT.containsKey(ch) && window.get(ch).intValue() < countT.get(ch).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);

    }
}
