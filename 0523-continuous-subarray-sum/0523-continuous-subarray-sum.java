class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            s+=nums[i];
            int r = s%k;
            if(mp.containsKey(r)){
                if(i-mp.get(r) > 1){
                    return true;
                }
            }
            else{
                mp.put(r,i);
            }
        }
        return false;
    }
}