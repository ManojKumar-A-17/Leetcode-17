class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> li  = new ArrayList<Integer>();
        int k=0;
        for(int i=0;i<m;i++){
            nums1[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums1[k++]=nums2[i];
        }
        // for(int i=0;i<nums1.length;i++){
        //     nums1[i]=li.get(i);
        // }
        Arrays.sort(nums1);

    }
}