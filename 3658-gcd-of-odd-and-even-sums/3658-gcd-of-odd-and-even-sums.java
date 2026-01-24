class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int es=0;
        int os=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0) es+=i;
            else os+=i;
        }
        return gcd(es,os);
    }
}