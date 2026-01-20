class Solution {
    public int totalHammingDistance(int[] nums) {
        int td=0;
        int n=nums.length;
        for(int i=0;i<32;i++){
            int co=0;
            for(int x:nums){
                co += (x>>i)&1;
            }
            int c1 = n-co;
            td += co*c1;
        }
        return td;
    }
}