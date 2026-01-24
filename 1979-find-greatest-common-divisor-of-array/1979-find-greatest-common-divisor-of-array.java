class Solution {
    public int gcd(int s,int l){
        if(l==0) return s;
        return gcd(l,s%l);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];
        int ans = gcd(s,l);
        return ans;
    }
}