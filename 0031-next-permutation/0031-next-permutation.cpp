class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        // 1st decreasing number
        int f=0,s=0;
        int l=0;
        int r=nums.size()-1;
        int fli=0;
        while(l<r){
            if(nums[r]>nums[r-1]){
                f=nums[r-1];
                fli=r-1;
                break;
            }
            r--;
        }
        if(r<=0) {f=nums[0];fli=0;};
        // next greater element to 1st found element
        int ge=f;
        int gi=fli;
        for(int i=nums.size()-1;i>=0;i--){
            if(nums[i] > f){
                ge=nums[i];
                gi=i;
                break;
            }
        }
        int t = nums[fli];
        nums[fli]=nums[gi];
        nums[gi]=t;
        int m = fli+1;
        if(fli==0 && gi==0){
            reverse(nums.begin(),nums.end());
        }
        else{reverse(nums.begin()+m,nums.end());};
        cout<<fli<<gi;
        cout<<ge;
        cout<<f;
    }
};