class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        long o=0;
        long e=1;
        long s=0;
        for(int x:arr){
            s+=x;
            if(s%2 == 0)e++;
            else o++;
        }
        long res = (e*o)%mod;
        return (int)res;
    }
}