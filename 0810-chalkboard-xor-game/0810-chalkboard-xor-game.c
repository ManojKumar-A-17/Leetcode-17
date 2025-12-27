bool xorGame(int* nums, int numsSize) {
    int x=0;
    for(int i=0;i<numsSize;i++){
        x^=nums[i];
    }
    if(x == 0)return true;
    if(numsSize%2 == 0)return true;
    return false;
}