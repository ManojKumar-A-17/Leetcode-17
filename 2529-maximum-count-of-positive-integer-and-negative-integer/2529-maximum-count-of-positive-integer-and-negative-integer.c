int maximumCount(int* nums, int numsSize) {
    int pc=0;
    int nc=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]>0)pc++;
        else if(nums[i]<0) nc++;
    }
    if(nc>pc)return nc;
    return pc;
}