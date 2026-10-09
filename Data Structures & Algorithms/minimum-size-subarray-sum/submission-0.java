class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left = 0 , right = 0 , end = nums.length , sum = 0; 
       int len = Integer.MAX_VALUE;
       while(right < end ){
        sum+= nums[right];
        while(sum >= target){
            len = Math.min(len , right-left+1);
            sum -= nums[left++]; 
        } 
        right++;
       }  
       return len == Integer.MAX_VALUE?0:len;
    }
}