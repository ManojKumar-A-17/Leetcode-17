int trap(int* height, int heightSize) {
    int i=0;
    int j=heightSize-1;
    int lm=height[i];
    int rm=height[j];
    int water=0;
    while(i<j){
        if(height[i]<height[j]){
            i++;
            lm=(lm>height[i])?lm:height[i];
            water += lm-height[i];
        }
        else{
            j--;
            rm=(rm>height[j])?rm:height[j];
            water += rm-height[j];
        }
    }
    return water;
}