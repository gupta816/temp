class Solution {
    public int[] searchRange(int[] arr, int t) {
        int n=arr.length;
        if(n==0)  return new int[]{-1, -1};
        int i1=-1;
        int i2=-1;
        int lo=0;
        int hi=n-1;
        
        while(lo<hi)
        {
            int mid=(hi+lo)/2;
            if(arr[mid]<t) lo=mid+1;
            else hi=mid;
            
            
        }
        if(arr[lo]==t)
        {
            int temp=lo;
            while(temp<n-1)
            {
                if(arr[temp]==arr[temp+1])
                {
                    temp++;
                }
                else{
                    break;
                }
            }
            return new int[]{lo, temp};
        }
        return new int[]{-1, -1};
        
    }
}
