int maxArea(int* height, int heightSize) {
    int maxarea=0;
    int l=0;
    int r=heightSize-1;
    while(l<r){
        int ch=(height[l]>height[r])?height[r]:height[l];
        int cw=r-l;
        int area=ch*cw;
        maxarea=(area>maxarea)?area:maxarea;
        if(height[l]>height[r]) r--;
        else l++;
    }
    return maxarea;
}