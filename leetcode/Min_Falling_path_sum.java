class Solution {
    public int min2(int a,int b) {
        return Math.min(a,b);
    }
    public int min3(int a,int b,int c) {
        return Math.min(a,Math.min(b,c));
    }
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        if(n==1) return arr[0][0];
        
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) dp[n-1][i]=arr[n-1][i];
        
        for(int i=n-2;i>-1;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                {
                    dp[i][j]=arr[i][j]+min2(dp[i+1][j],dp[i+1][j+1]);
                }
                else if(j==n-1)
                {
                     dp[i][j]=arr[i][j]+min2(dp[i+1][j],dp[i+1][j-1]);
                }
                else{
                     dp[i][j]=arr[i][j]+min3(dp[i+1][j],dp[i+1][j+1],dp[i+1][j-1]);
                }
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(dp[0][i],min);
        }
        return min;
    }
}
