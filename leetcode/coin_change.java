class Solution {
    public int coinChange(int[] arr, int sum) {
        int n=arr.length;
        int[] dp=new int[sum+1];
        dp[0]=0;
        int max=Integer.MAX_VALUE;
        for(int i=1;i<=sum;i++) dp[i]=max;
        
        for(int i=1;i<=sum;i++)
        {
            int ans=max;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<=i)
                {
                    ans=Math.min(ans,dp[i-arr[j]]);
                }
            } 
            if(ans==max) dp[i]=max;
            else dp[i]=ans+=1;
        }
        
        if(dp[sum]==max) return -1;
        return dp[sum];
        
    }
}
