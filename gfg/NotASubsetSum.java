class Solution {
    long findSmallest(long[] arr, int n) {
        // code here
        long x=1;
        for(int i=1;i<=n;i++)
        {
            if(x+1>arr[i-1]){
                x+=arr[i-1];
            }
            
        }
        return x;
    }
}
