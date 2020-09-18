// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
class Solution {
    public int findMaximumXOR(int[] nums) {
        // tc -> n^2, sc-> 1
        int maxOr = 0;
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                maxOr = Math.max(maxOr, nums[i]^nums[j]);
            }
        }
        
        return maxOr;
    }
}
