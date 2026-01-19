class Solution {
    public int missingNumber(int[] nums) {
        int r1=0;
        int r2=0;
        for(int i=0;i<=nums.length;i++){
            r1^=i;
        }
        for(int i=0;i<nums.length;i++){
            r2^=nums[i];
        }
        return r1^r2;
    }
}