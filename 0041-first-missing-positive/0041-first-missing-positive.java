class Solution {
    public int firstMissingPositive(int[] nums) {
        int c=1;
        int i=0;
        int j=nums.length-1;
        while(true){
            int o=0;
            if(nums[i]==c){
                o=1;
                c++;
            }
            i++;
        }
        return c;
    }
}