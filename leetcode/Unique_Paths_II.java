class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m+1][n+1];

        dp[m][n]=arr[m-1][n-1]^1;
        for(int i=n-1;i>0;i--){
            if(arr[m-1][i-1]==1 || dp[m][i+1]==0) dp[m][i]=0;
            else dp[m][i]=1;
        }
    
         for(int i=m-1;i>0;i--){
            if(arr[i-1][n-1]==1 || dp[i+1][n]==0) dp[i][n]=0;
             else dp[i][n]=1;
        }

         for(int i=m-1;i>0;i--)
        {
            for(int j=n-1;j>0;j--)
            {
                if(arr[i-1][j-1]==1) dp[i][j]=0;
                else dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[1][1];
    }
}
