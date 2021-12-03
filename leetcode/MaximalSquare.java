class Solution {
    public int maximalSquare(char[][] mat) {
        int m=mat.length;
        int ans=0;
        
        int n=mat[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++)
        {
            if(mat[0][i]=='1') 
            {ans=1;break;}
        }
       for(int i=0;i<m;i++)
        {
            if(mat[i][0]=='1') 
            {ans=1;break;}
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=mat[i][j]-'0';
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(dp[i][j]!=0)
                {
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans*ans;
        
         
    }
}
