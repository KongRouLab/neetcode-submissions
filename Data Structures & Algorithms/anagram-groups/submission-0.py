class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_dict = defaultdict(list)
        for s in strs:
            sorted_key = "".join(sorted(s))
            anagrams_dict[sorted_key].append(s)
        return list(anagrams_dict.values())


            

