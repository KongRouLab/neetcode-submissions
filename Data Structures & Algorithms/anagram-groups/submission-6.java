class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        s -> {
                            char[] chars = s.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}
