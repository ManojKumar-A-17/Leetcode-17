class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> w = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(w.contains(nums[i])) return true;
            w.add(nums[i]);
            if(w.size()>k){
                w.remove(nums[i-k]);
            }
        }
        return false;
    }
}