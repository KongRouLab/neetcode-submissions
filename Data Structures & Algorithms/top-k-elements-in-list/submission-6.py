class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = Counter(nums)
        bucket = [[]for _ in range(len(nums) +1)]

        for n, c in freq.items():
            bucket[c].append(n)

        res = []

        for i in range(len(bucket) -1, 0, -1):
            for n in bucket[i]:
                res.append(n)
                if len(res) == k:
                    return res
