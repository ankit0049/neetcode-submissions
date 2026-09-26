class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]: 
        size = len(nums)
        result = [0] * (size * 2)
        

        for i in range (len(nums)):
            result[i] = nums[i]
            result[i+size] = nums[i]
        return result