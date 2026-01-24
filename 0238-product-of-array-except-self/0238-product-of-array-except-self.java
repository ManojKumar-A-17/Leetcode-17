class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] re = new int[nums.length];
        re[0] = 1;
        for(int i=1;i<nums.length;i++){
            re[i]=re[i-1] * nums[i-1];
        }
        int s=1;
        for(int i=nums.length-1;i>=0;i--){
            re[i]*=s;
            s*=nums[i];
        }
        return re;
    }
}