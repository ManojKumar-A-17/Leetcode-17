class Solution {
    public int firstMissingPositive(int[] nums) {
        int x=1,t=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                x++;
            }
        }
        return x;
    }
}