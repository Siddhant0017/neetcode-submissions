
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        ans = {}

        for s in strs:
            count = [0] * 26

            for i in s:
                count[ord(i) - ord('a')] += 1

            count = tuple(count)

            if count not in ans:
                ans[count] = []

            ans[count].append(s)

        return list(ans.values())
