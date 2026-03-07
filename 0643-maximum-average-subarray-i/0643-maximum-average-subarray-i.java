class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int maxsum=s;
        for(int i=k;i<nums.length;i++){
            s=s-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,s);
        }
        return (double)maxsum/k;
    }
}