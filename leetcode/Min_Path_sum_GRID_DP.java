class Solution {
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
       
        int[][] dp=new int[m+1][n+1];
        int max=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++)
        {
            dp[m][i]=max;
            
        }
        for(int i=0;i<=m;i++)
        {
            dp[i][n]=max;
        }
        
        dp[m][n-1]=0;
        dp[m-1][n]=0;

        for(int i=m-1;i>-1;i--)
        {
            for(int j=n-1;j>-1;j--)
            {
                dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
        
    }
}
